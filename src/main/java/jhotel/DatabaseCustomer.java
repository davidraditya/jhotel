package jhotel;

import java.util.ArrayList;
/**
 * Class DatabaseCustomer berisi database user
 *
 * @author David Raditya K - 1506690372
 * @version 2018.05.16
 */
public class DatabaseCustomer{
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<>();
    private static int LAST_CUSTOMER_ID = 0;

    /**
     * Accessor untuk object dari class DatabaseCustomer
     * untuk membuat ArrayList berisi customer
     *
     * @return CUSTOMER_DATABASE
     */
    public static ArrayList<Customer> getCustomerDatabase(){
        return CUSTOMER_DATABASE;
    }

    /**
     * Accessor untuk object dari class DatabaseCustomer
     * untuk mendapatkan ID dari customer terakhir
     *
     * @return LAST_CUSTOMER_ID ID
     *
     */
    public static int getLastCustomerID(){
        return LAST_CUSTOMER_ID;
    }

    /**
     * Metode untuk menambah data Customer
     *
     * @param baru
     * @return true
     */
    public static boolean addCustomer(Customer baru) throws PelangganSudahAdaException
    {
        for(Customer customer : CUSTOMER_DATABASE){
            if(customer.getID() == baru.getID() || customer.getEmail().equals(baru.getEmail())){
                throw new PelangganSudahAdaException(baru);
            }
        }
        CUSTOMER_DATABASE.add(baru);
        LAST_CUSTOMER_ID = baru.getID();
        return true;
    }

    /**
     * Accessor untuk object dari class DatabaseCustomer
     * untuk mendapatkan customer dengan id yang ditentukan
     *
     * @param id
     * @return customer
     */
    public static Customer getCustomer(int id)
    {
        for(Customer customer : CUSTOMER_DATABASE){
            if(customer.getID() == id){
                return customer;
            }
        }
        return null;
    }

    /**
     * Accessor untuk object dari class DatabaseCustomer
     * untuk mendapatkan data login customer yang menggunakan email dan password
     *
     * @param email menentukan nilai email
     * @param password menentukan nilai password
     * @return customer
     */
    public static Customer getCustomerLogin(String email, String password)
    {
        for(Customer customer : CUSTOMER_DATABASE){
            if(customer.getEmail().equals(email) && customer.getPassword().equals(password)){
                return customer;
            }
        }
        return null;
    }

    /**
     * Method untuk menghapus data customer.
     *
     * @return true
     */
    public static boolean removeCustomer(int id) throws PelangganTidakDitemukanException
    {
        for(Customer customer : CUSTOMER_DATABASE){
            if (customer.getID() == id){
                Pesanan pesan = DatabasePesanan.getPesananAktif(customer);
                try {
                    DatabasePesanan.removePesanan(customer);
                }
                catch (PesananTidakDitemukanException e){
                    System.out.println(e.getPesan());
                }
                if (CUSTOMER_DATABASE.remove(customer)){
                    return true;
                }
            }
        }
        return false;
    }
}
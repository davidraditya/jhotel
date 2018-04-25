package jhotel;
import java.util.ArrayList;
/**
 * Class Pesanan
 *
 * @author David Raditya K - 1506690372
 * @version 2018.04.12
 */
public class DatabaseCustomer
{
    /*
     * Deklarasi variable
     */
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<Customer>();
    private static int LAST_CUSTOMER_ID = 0;

    /**
     * Metode untuk menambah Customer
     *
     * @return LAST_CUSTOMER_ID ID
     *
     */
    public static int getLastCustomerId(){
        return LAST_CUSTOMER_ID;
    }

    /**
     * Metode untuk menambah Customer
     *
     * @param baru customer baru
     *
     */
    public static boolean addCustomer (Customer baru) throws PelangganSudahAdaException{
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++) {
            Customer tes = CUSTOMER_DATABASE.get(i);
            if (tes.getID()==baru.getID() || tes.getNama()==baru.getNama()){
                throw new PelangganSudahAdaException(tes);
            }
        }
        LAST_CUSTOMER_ID=baru.getID();
        CUSTOMER_DATABASE.add(baru);
        return true;
    }

    /**
     * Metode untuk menambah Customer
     *
     * @param id id
     *
     */
    public static Customer getCustomer(int id)
    {
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++) {
            Customer tes = CUSTOMER_DATABASE.get(i);
            if (tes.getID()==id){
                return tes;
            }
        }
        return null;
    }

    /**
     * Metode untuk menghapus customer
     *
     * @param id customer
     *
     */
    public static boolean removeCustomer(int id) throws PelangganTidakDitemukanException
    {
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++) {
            Customer coba = CUSTOMER_DATABASE.get(i);
            if (coba.getID()==id){
                Pesanan pesan = DatabasePesanan.getPesananAktif(coba);
                try {
                    DatabasePesanan.removePesanan(coba);
                } catch (PesananTidakDitemukanException test){
                    System.out.println(test.getPesan());
                }
                if(CUSTOMER_DATABASE.remove(coba))
                {
                    return true;
                }
            }
        }
        throw new PelangganTidakDitemukanException(id);
    }

    /**
     * Metode untuk mengambil data di database
     *
     */
    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }

}
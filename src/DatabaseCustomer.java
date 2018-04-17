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
    public static boolean addCustomer(Customer baru)
    {
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++) {
            Customer tes = CUSTOMER_DATABASE.get(i);
            if (tes.getID()==baru.getID()){
                return false;
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
     * @param id id customer
     *
     */
    public static boolean removeCustomer(int id)
    {
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++) {
            Customer tes = CUSTOMER_DATABASE.get(i);
            if (tes.getID()==id){
                Pesanan pesan = DatabasePesanan.getPesananAktif(tes);
                DatabasePesanan.removePesanan(pesan);
                if(CUSTOMER_DATABASE.remove(tes))
                {
                    return true;
                }
            }
        }
        return false;
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
import java.util.ArrayList;

/**
 * Class DatabasePesanan
 *
 * @author David Raditya K - 1506690372
 * @version 2018.04.12
 */


public class DatabasePesanan
{
    private static ArrayList<Pesanan> PESANAN_DATABASE = new ArrayList<Pesanan>();
    private static int LAST_PESANAN_ID = 0;

    public static ArrayList<Pesanan> getPesananDatabase(){
        return PESANAN_DATABASE;
    }

    public static int getLastPesananID(){
        return LAST_PESANAN_ID;
    }

    /**
     * Metode untuk menambah pesanan
     *
     * @param baru pesanan baru
     *
     */
    public static boolean addPesanan(Pesanan baru)
    {
        for (int i = 0; i < PESANAN_DATABASE.size(); i++) {
            Pesanan tes = PESANAN_DATABASE.get(i);
            if (tes.getStatusAktif()==true&&tes.getID()==baru.getID()){
                return false;
            }
        }
        LAST_PESANAN_ID=baru.getID();
        PESANAN_DATABASE.add(baru);
        return true;
    }

    /**
     * Metode untuk menghapus pesanan
     *
     * @param pesan pesanan
     *
     */
    public static boolean removePesanan(Pesanan pesan)
    {
        for (int i = 0; i < PESANAN_DATABASE.size(); i++) {
            Pesanan tes = PESANAN_DATABASE.get(i);
            if (tes.equals(pesan)){
                if(tes.getRoom() != null)
                {
                    Administrasi.pesananDibatalkan(tes);
                }
                else
                {
                    if(tes.getStatusAktif())
                    {
                        tes.setStatusAktif(false);
                    }
                }

                if(PESANAN_DATABASE.remove(tes))
                {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Metode untuk mengambil pesanan
     *
     * @param id data customer
     *
     */
    public static Pesanan getPesanan(int id)
    {
        for (int i = 0; i < PESANAN_DATABASE.size(); i++) {
            Pesanan tes = PESANAN_DATABASE.get(i);
            if (tes.getID()==id){
                return tes;
            }
        }
        return null;
    }

    public static Pesanan getPesanan(Room kamar)
    {
        for (int i = 0; i < PESANAN_DATABASE.size(); i++) {
            Pesanan tes = PESANAN_DATABASE.get(i);
            if (tes.getRoom().equals(kamar)){
                return tes;
            }
        }
        return null;
    }

    public static Pesanan getPesananAktif(Customer pelanggan)
    {
        for (int i = 0; i < PESANAN_DATABASE.size(); i++) {
            Pesanan tes = PESANAN_DATABASE.get(i);
            if (tes.getStatusAktif()==true&&tes.getPelanggan().equals(pelanggan)){
                return tes;
            }
        }
        return null;
    }

    /**
     * Metode untuk membatalkan pesanan
     *
     * @param pesan pesanan
     *
     */
    public static void pesananDibatalkan(Pesanan pesan)
    {

    }
}
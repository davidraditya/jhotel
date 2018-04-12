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

    private static ArrayList<Pesanan> getPesananDatabase(){
        return PESANAN_DATABASE;
    }

    private static int getLastPesananId(){
        return LAST_PESANAN_ID;
    }

    /**
     * 
     * @return false
     */
    public static boolean addPesanan(Pesanan baru)
    {
        if(PESANAN_DATABASE.contains(baru)){
            if(baru.getStatusAktif()){
                return false;
            }
            else{
                PESANAN_DATABASE.add(baru);
                return true;
            }
        }
        else{
            PESANAN_DATABASE.add(baru);
            return true;
        }
    }

    /**
     *
     * @return id
     */
    public static Pesanan getPesanan(int id){
        for(Pesanan pesanan : PESANAN_DATABASE){
            if(pesanan.getID() == id){
                return pesanan;
            }
        }

        return null;
    }

    /**
     *
     * @return kamar
     */
    public static Pesanan getPesanan(Room kamar){
        for(Pesanan pesanan : PESANAN_DATABASE){
            if(pesanan.getRoom().equals(kamar)){
                return pesanan;
            }
        }

        return null;
    }

    /**
     *
     * @return id
     */
    public static Pesanan getPesananAktif(Customer pelanggan)
    {
        for(Pesanan pesanan : PESANAN_DATABASE){
            if(pesanan.getPelanggan().equals(pelanggan)){
                if(pesanan.getStatusAktif()){
                    return pesanan;
                }
            }
        }

        return null;
    }

    /**
     * 
     * @return false
     */
    public static boolean removePesanan(Pesanan pesan){
        for(Pesanan pesanan : PESANAN_DATABASE){
            if(pesanan.equals(pesan)){
                if(pesanan.getRoom() != null){
                    Administrasi.pesananDibatalkan(pesanan);
                }
                else{
                    if(pesanan.getStatusAktif()){
                        pesanan.setStatusAktif(false);
                    }
                }

                if(PESANAN_DATABASE.remove(pesanan)){
                    return true;
                }
            }
        }

        return false;
    }

}

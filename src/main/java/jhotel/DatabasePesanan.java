package jhotel;

import java.util.ArrayList;

/**
 * Class DatabasePesanan berisi database order
 *
 * @author David Raditya K - 1506690372
 * @version 2018.05.16
 */


public class DatabasePesanan
{
    private static ArrayList<Pesanan> PESANAN_DATABASE = new ArrayList<>();
    private static int LAST_PESANAN_ID = 0;

    /**
     * Method untuk membuat ArrayList berisi pesanan
     *
     * @return PESANAN_DATABASE
     */
    public static ArrayList<Pesanan> getPesananDatabase(){
        return PESANAN_DATABASE;
    }

    /**
     * Method untuk mendapatkan ID dari pesanan terakhir
     *
     * @return LAST_PESANAN_ID
     */
    public static int getLastPesananID(){
        return LAST_PESANAN_ID;
    }

    /**
     * Method untuk menambah pesanan ke database
     *
     * @param baru
     *
     */
    public static boolean addPesanan(Pesanan baru) throws PesananSudahAdaException
    {
        for(Pesanan pesan : PESANAN_DATABASE){
            if(pesan.getStatusAktif() && pesan.getID() == baru.getID()){
                throw new PesananSudahAdaException(baru);
                //return false;
            }
        }
        LAST_PESANAN_ID = baru.getID();
        PESANAN_DATABASE.add(baru);
        return true;
    }

    /**
     * Metode untuk menghapus pesanan dari database
     *
     * @param cust
     *
     */
    public static boolean removePesanan(Customer cust) throws PesananTidakDitemukanException
    {
        for(Pesanan pesanan : PESANAN_DATABASE){
            if(pesanan.getPelanggan().equals(cust)){
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
        throw new PesananTidakDitemukanException(cust);
    }

    /**
     * Metode untuk mengambil data pesanan
     *
     * @param id
     * @return pesanan
     */
    public static Pesanan getPesanan(int id)
    {
        for(Pesanan pesanan : PESANAN_DATABASE){
            if(pesanan.getID() == id){
                return pesanan;
            }
        }
        return null;
    }

    /**
     * untuk mengambil data pesanan aktif
     *
     * @param kamar
     * @return pesanan
     */
    public static Pesanan getPesananAktif(Room kamar)
    {
        for(Pesanan pesanan : PESANAN_DATABASE){
            if(pesanan.getRoom().equals(kamar) && pesanan.getStatusAktif()){
                return pesanan;
            }
        }
        return null;
    }

    /**
     * untuk mengambil data pesanan aktif
     *
     * @param pelanggan berisi objek Customer
     * @return pesanan
     */
    public static Pesanan getPesananAktif(Customer pelanggan)
    {
        for(Pesanan pesanan : PESANAN_DATABASE){
            if(pesanan.getPelanggan().equals(pelanggan) && pesanan.getStatusAktif()){
                return pesanan;
            }
        }
        return null;
    }
}
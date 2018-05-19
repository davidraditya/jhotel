package jhotel;
import java.util.*;
import java.text.*;
/**
 * Class Pesanan
 *
 * @author David Raditya K - 1506690372
 * @version 2018.05.16
 */
public class Pesanan
{
    // deklarasi instance variable
    private int id;
    private double biaya;
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isAktif;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    private Date tanggalPesan;

    /**
     * Constructor for objects of class Pesanan
     * 
     * @param jumlahHari berapa yang harus dibayar
     * @param pelanggan data pelanggan
     */
    public  Pesanan(double jumlahHari, Customer pelanggan)
    {
        this.jumlahHari = jumlahHari;
        this.pelanggan = pelanggan;
        //biaya = kamar.getDailyTariff()*jumlahHari;
        id = DatabasePesanan.getLastPesananID()+1;
        isAktif = true;
        tanggalPesan = new Date();
    }

    /**
     * Accessor for objects of class Pesanan
     * untuk meminta nilai ID
     *
     * @return id.
     */
    public int getID()
    {
        return id;
    }

    /**
     * Accessor for objects of class Pesanan
     * untuk meminta nilai biaya
     * 
     * @return biaya.
     */
    public double getBiaya()
    {
        return biaya;
    }
    
    /**
     * Accessor for objects of class Pesanan
     * untuk meminta nilai jumlah hari
     * 
     * @return jumlahHari.
     */
    public double getJumlahHari()
    {
        return jumlahHari;
    }
    
    /**
     * Accessor for objects of class Pesanan
     * untuk meminta nilai pelanggan
     * 
     * @return pelanggan.
     */
    public Customer getPelanggan()
    {
        return pelanggan;
    }

    /**
     * Accessor for objects of class Pesanan
     * untuk meminta nilai status aktif
     *
     * @return isAktif.
     */
    public boolean getStatusAktif()
    {
        return isAktif;
    }

    /**
     * Accessor for objects of class Pesanan
     * untuk meminta nilai status diproses
     * 
     * @return isDiproses.
     */
    public boolean getStatusDiproses()
    {
        return isDiproses;
    }
    
    /**
     * Accessor for objects of class Pesanan
     * untuk meminta nilai status selesai
     * 
     * @return isSelesai.
     */
    public boolean getStatusSelesai()
    {
        return isSelesai;
    }
    
    /**
     * Accessor for objects of class Pesanan
     * untuk meminta keterangan kamar
     * 
     * @return kamar.
     */
    public Room getRoom()
    {
        return kamar;
    }
    
    /**
     * Accessor for objects of class Pesanan
     * untuk meminta keterangan tanggal memesan
     * 
     * @return tanggalPesan.
     */
    public Date getTanggalPesan()
    {
        DateFormat df = new SimpleDateFormat("'DOB : 'dd MMMM yyyy");
        String hasil = df.format(tanggalPesan);
        System.out.println(hasil);
        return tanggalPesan;
    }

    /**
     * Mutator for objects of class Pesanan
     * untuk memberi nilai ID
     *
     * @param id
     */
    public void setID(int id)
    {
        this.id = id;
    }

    /**
     * Mutator for objects of class Pesanan
     * untuk memberi nilai biaya
     *
     */
    public void setBiaya()
    {
        biaya = kamar.getDailyTariff()*jumlahHari;
    }
    
    /**
     * Mutator for objects of class Pesanan
     * untuk memberi nilai jumlah hari
     * 
     * @param jumlahHari
     */
    public void setJumlahHari(double jumlahHari)
    {
        this.jumlahHari = jumlahHari;
    }
    
    /**
     * Mutator for objects of class Pesanan
     * untuk memberi nilai pelanggan
     * 
     * @param pelanggan
     */
    public void setPelanggan(Customer pelanggan)
    {
        this.pelanggan = pelanggan;
    }

    /**
     * Mutator for objects of class Pesanan
     * untuk memberi nilai status aktif
     *
     * @param aktif
     */
    public void setStatusAktif(boolean aktif)
    {
        isAktif = aktif;
    }

    /**
     * Mutator for objects of class Pesanan
     * untuk memberi nilai status diproses
     * 
     * @param diproses
     */
    public void setStatusDiproses(boolean diproses)
    {
        isDiproses = diproses;
    }
    
    /**
     * Mutator for objects of class Pesanan
     * untuk memberi nilai status selesai
     * 
     * @param selesai
     */
    public void setStatusSelesai(boolean selesai)
    {
        isSelesai = selesai;
    }
    
    /**
     * Mutator for objects of class Pesanan
     * untuk memberi keterangan kamar
     * 
     * @param kamar
     */
    public void setRoom(Room kamar)
    {
        this.kamar = kamar;
    }
    
    /**
     * Mutator for objects of class Pesanan
     * untuk memberi keterangan tanggal memesan
     * 
     * @param tanggalPesan
     */
    public void setTanggalPesan(Date tanggalPesan)
    {
        this.tanggalPesan = tanggalPesan;
    }


    public String toString()
    {
        String final_status = "KOSONG";

        if (isDiproses && !isSelesai){
            final_status = "DIPROSES";
        }
        else if (!isDiproses && !isSelesai){
            final_status = "KOSONG";
        }
        else if (!isDiproses && isSelesai){
            final_status = "SELESAI";
        }

        if (kamar != null) {
            return  "\nPesanan\n" +
                    "\nDibuat Oleh          : " +pelanggan.getNama()+
                    "\nJumlah hari          : " +jumlahHari+
                    "\nProses booking untuk : " +kamar.getHotel().getNama()+
                    "\nKamar Nomor          : " +kamar.getNomorKamar()+
                    "\ntipe kamar           : " +kamar.getTipeKamar()+
                    "\nStatus               : " +final_status;
        }
        return  "\nPesanan\n" +
                "\nDibuat Oleh          : " +pelanggan.getNama()+
                "\nJumlah hari          : " +jumlahHari+
                "\nProses booking untuk : null" +
                "\nKamar Nomor          : null" +
                "\ntipe kamar           : null" +
                "\nStatus               : " +final_status;
    }
}

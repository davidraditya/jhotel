import java.util.*;
import java.text.*;
/**
 * Class Pesanan
 *
 * @author David Raditya K - 1506690372
 * @version 2018.04.12
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
    public Pesanan(double jumlahHari, Customer pelanggan)
    {
        this.jumlahHari=jumlahHari;//instance variable
        this.pelanggan=pelanggan;//instance variable
        biaya=kamar.getDailyTariff() * getJumlahHari();
        isAktif = true;
        tanggalPesan = new Date();
        id = DatabasePesanan.getLastPesananID() + 1;
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
        DateFormat formatter = new SimpleDateFormat("'DOB 'dd MMMM yyyy");
        String output = formatter.format(tanggalPesan);
        //System.out.print(output);
        System.out.println(output);
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
        biaya = kamar.getDailyTariff() * jumlahHari;
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
        isDiproses = aktif;
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
    
     /*
     * Untuk mencetak data
     *
    public String printData()
    {
        System.out.printf("\nPesanan\n");
        System.out.println("Nama Pelanggan         : " +pelanggan.getNama());
        System.out.println("Status layanan diproses: " +isDiproses);
        System.out.println("Status layanan selesai : " +isSelesai);
        System.out.println("Jumlah Hari            : " +jumlahHari);
        System.out.println("Biaya                  : " +biaya);
    }*/
    
    public String toString(){
        String final_status = "KOSONG";
        
        if (isDiproses == true && isSelesai == false){
            final_status = "DIPROSES";
        } else if (isDiproses == false && isSelesai == false){
            final_status = "KOSONG";
        } else if (isDiproses == false && isSelesai == true){
            final_status = "SELESAI";
        }
        
        return "Dibuat Oleh " +pelanggan.getNama() +
                ".Proses booking untuk" +kamar.getHotel()+
                "Kamar Nomor " + kamar.getNomorKamar()+
                "dengan tipe kamar yang diinginkan "+kamar.getTipeKamar()+
                ". Status :" +final_status+ ".";
    }
}

import java.util.*;
import java.text.*;
/**
 * Class Pesanan
 *
 * @author David Raditya K - 1506690372
 * @version 2018.03.22
 */
public class Pesanan
{
    // deklarasi instance variable
    private double biaya;
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    private Date tanggalPesan;

    /**
     * Constructor for objects of class Pesanan
     * 
     * @param biaya, pelanggan.
     */
    public Pesanan(double jumlahHari, Customer pelanggan, Room kamar, int hari, int bulan, int tahun)
    {
        this.biaya=kamar.getDailyTariff()*jumlahHari;
        this.jumlahHari=jumlahHari;//instance variable
        this.pelanggan=pelanggan;//instance variablee
        this.kamar=kamar;//instance variable
        tanggalPesan= new Date(hari,bulan,tahun);
    }

    public Pesanan(double jumlahHari, Customer pelanggan, Room kamar, Date tanggalPesan)
    {
        this.biaya=kamar.getDailyTariff()*jumlahHari;
        this.jumlahHari=jumlahHari;//instance variable
        this.pelanggan=pelanggan;//instance variablee
        this.kamar=kamar;//instance variable
        this.tanggalPesan=tanggalPesan;
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
     * untuk memberi nilai biaya
     * 
     * @param biaya.
     */
    public void setBiaya()
    {
        biaya = kamar.getDailyTariff() * jumlahHari;
    }
    
    /**
     * Mutator for objects of class Pesanan
     * untuk memberi nilai jumlah hari
     * 
     * @param biaya.
     */
    public void setJumlahHari(double jumlahHari)
    {
        this.jumlahHari = jumlahHari;
    }
    
    /**
     * Mutator for objects of class Pesanan
     * untuk memberi nilai pelanggan
     * 
     * @param pelanggan.
     */
    public void setPelanggan(Customer pelanggan)
    {
        this.pelanggan = pelanggan;
    }

    /**
     * Mutator for objects of class Pesanan
     * untuk memberi nilai status diproses
     * 
     * @param diproses.
     */
    public void setStatusDiproses(boolean diproses)
    {
        isDiproses = diproses;
    }
    
    /**
     * Mutator for objects of class Pesanan
     * untuk memberi nilai status selesai
     * 
     * @param selesai.
     */
    public void setStatusSelesai(boolean selesai)
    {
        isSelesai = selesai;
    }
    
    /**
     * Mutator for objects of class Pesanan
     * untuk memberi keterangan kamar
     * 
     * @param kamar.
     */
    public void setRoom(Room kamar)
    {
        this.kamar = kamar;
    }
    
    /**
     * Mutator for objects of class Pesanan
     * untuk memberi keterangan tanggal memesan
     * 
     * @param tanggalPesan.
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

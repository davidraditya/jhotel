
/**
 * Class Pesanan
 *
 * @author David Raditya K - 1506690372
 * @version 2018.03.10
 */
public class Pesanan
{
    // deklarasi instance variable
    private double biaya;
    private Customer pelanggan;
    private String nama_pelanggan;
    private TipeKamar tipe_kamar;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;

    /**
     * Constructor for objects of class Pesanan
     * 
     * @param biaya, pelanggan.
     */
    public Pesanan(double biaya, Customer pelanggan)
    {
        this.biaya = biaya;
        this.pelanggan = pelanggan;
        nama_pelanggan = pelanggan.getNama();
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
     * untuk meminta nilai pelanggan
     * 
     * @return pelanggan.
     */
    public Customer getPelanggan()
    {
        return pelanggan;
    }
    
    public String getNamaPelanggan()
    {
        return nama_pelanggan;
    }
    
    public TipeKamar getTipeKamar()
    {
        return tipe_kamar;
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
     * Mutator for objects of class Pesanan
     * untuk memberi nilai biaya
     * 
     * @param biaya.
     */
    public void setBiaya(double biaya)
    {
        this.biaya = biaya;
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
    
    public void setNamaPelanggan(String nama_pelanggan)
    {
        this.nama_pelanggan = nama_pelanggan;
    }
    
    public void setTipeKamar(TipeKamar tipe_kamar)
    {
        this.tipe_kamar = tipe_kamar;
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
    
    /*
     * Untuk mencetak data
     */
    public void printData()
    {
        System.out.printf("\nPesanan\n");
        System.out.println("Nama Pelanggan: " +nama_pelanggan);
        System.out.println("Tipe Kamar: " +tipe_kamar);
        System.out.println("Status layanan diproses: " +isDiproses);
        System.out.println("Status layanan selesai: " +isSelesai);
    }
}


/**
 * Class Pesanan
 *
 * @author (David Raditya K - 1506690372)
 * @version (2018.3.1)
 */
public class Pesanan
{
    // deklarasi variabel
    private double biaya;
    private Customer pelanggan;
    private String nama_pelanggan;
    private String jenis_kamar;
    private boolean isDiproses;
    private boolean isSelesai;


    /**
     * Constructor for objects of class Pesanan
     * 
     * @param biaya, pelanggan.
     */
    public Pesanan(double biaya, Customer pelanggan)
    {
        this.biaya = biaya;
        this.pelanggan = pelanggan;
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
     * @param baru.
     */
    public void setPelanggan(Customer baru)
    {
        pelanggan = baru;
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
     * @param diproses.
     */
    public void setStatusSelesai(boolean diproses)
    {
        isSelesai = diproses;
    }
    
    /*
     * Untuk mencetak data
     */
    public void printData()
    {
    }
}

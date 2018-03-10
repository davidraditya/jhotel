
/**
 * Class Pesanan
 *
 * @author David Raditya K - 1506690372
 * @version 2018.03.10
 */
public class Hotel
{
    // deklarasi variabel
    private String nama;
    private Lokasi lokasi;
    private int bintang;
    

    /**
     * Constructor for objects of class Hotel
     * 
     * @param nama, lokasi, bintang.
     */
    public Hotel(String nama, Lokasi lokasi, int bintang)
    {
        //instance variable
        this.nama = nama;
        this.lokasi = lokasi;
        this.bintang = bintang;
    }

    /**
     * Accessor for objects of class Hotel
     * untuk meminta nilai bintang
     * 
     * @return bintang.
     */
    public int getBintang(){
        return bintang;
    }
    
    /**
     * Accessor for objects of class Hotel
     * untuk meminta nama
     * 
     * @return nama.
     */
    public String getNama(){
        return nama;
    }
    
    /**
     * Accessor for objects of class Hotel
     * untuk meminta lokasi
     * 
     * @return lokasi.
     */
    public Lokasi getLokasi(){
        return lokasi;
    }
    
    /**
     * Mutator for objects of class Hotel
     * untuk memberi nama
     * 
     * @param nama.
     */
    public void setNama(String nama){
        this.nama = nama;
    }
    
    /**
     * Mutator for objects of class Hotel
     * untuk memberi lokasi
     * 
     * @param lokasi.
     */
    public void setLokasi(Lokasi lokasi){
        this.lokasi = lokasi;
    }
    
    /**
     * Mutator for objects of class Hotel
     * untuk memberi nilai bintang
     * 
     * @param bintang.
     */
    public void setBintang(int bintang){
        this.bintang = bintang;
    }
    
    /*
     * Untuk mencetak data
     */
    public void printData(){
        System.out.printf("\nHotel\n");
        System.out.println("Nama Hotel: " +nama);
        System.out.println("Lokasi: " +lokasi.getDeskripsi());
        System.out.println("Bintang: " +bintang);
    }
}

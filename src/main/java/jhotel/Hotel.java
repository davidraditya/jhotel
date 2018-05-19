package jhotel;
/**
 * Class Pesanan
 *
 * @author David Raditya K - 1506690372
 * @version 2018.05.16
 */
public class Hotel
{
    private int id;
    private String nama;
    private Lokasi lokasi;
    private int bintang;

    public Hotel()
    {
        //
    }

    /**
     * Constructor for objects of class Hotel.
     *
     * @param nama
     * @param lokasi
     * @param bintang
     */
    public Hotel(String nama, Lokasi lokasi, int bintang)
    {
        this.nama = nama;
        this.lokasi = lokasi;
        this.bintang = bintang;
        id = DatabaseHotel.getLastHotelID()+1;
    }

    /**
     * Accessor for objects of class Hotel
     * untuk mendapatkan nilai id
     *
     * @return id
     */
    public int getID() {
        return id;
    }

    /**
     * Accessor for objects of class Hotel
     * untuk mendapatkan nilai bintang.
     *
     * @return bintang
     */
    public int getBintang()
    {
        return bintang;
    }

    /**
     * Accessor for objects of class Hotel
     * untuk mendapatkan nilai nama.
     *
     * @return nama
     */
    public String getNama()
    {
        return nama;
    }

    /**
     * Accessor for objects of class Hotel
     * untuk mendapatkan nilai lokasi.
     *
     * @return lokasi
     */
    public Lokasi getLokasi()
    {
        return lokasi;
    }

    /**
     *
     * @param id berisi id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Mutator for objects of class Hotel
     * untuk menentukan nilai nama.
     *
     * @param nama
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }

    /**
     * Mutator for objects of class Hotel
     * untuk menentukan nilai lokasi.
     *
     * @param lokasi
     */
    public void setLokasi(Lokasi lokasi)
    {
        this.lokasi = lokasi;
    }

    /**
     * Mutator for objects of class Hotel
     * untuk menentukan nilai bintang.
     *
     * @param bintang
     */
    public void setBintang(int bintang)
    {
        this.bintang = bintang;
    }

    public String toString()
    {
        return "\nHotel\n"+
                "\nNama Hotel    : "+nama+
                "\nLokasi        : "+lokasi.getDeskripsi()+
                "\nBintang       : "+bintang;
    }
}

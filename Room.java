
/**
 * Class Room
 *
 * @author David Raditya K - 1506690372
 * @version 2018.03.22
 */
public abstract class Room
{
    // instance variables - replace the example below with your own
    private Hotel hotel;
    private String nomor_kamar;
    private boolean isAvailable;
    protected double dailyTariff;
    private StatusKamar status_kamar;
    private Pesanan pesan;
    
    /**
     * Constructor for objects of class Room
     */
    public Room(Hotel hotel, String nomor_kamar, boolean isAvailable, 
    StatusKamar status_kamar)
    {
        // initialise instance variables
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        this.isAvailable = isAvailable;
        this.status_kamar = status_kamar;
    }

    /**
     * Accessor for objects of class Room
     * untuk meminta keterangan hotel
     * 
     * @return hotel.
     */
    public Hotel getHotel()
    {
        return hotel;
    }
  
    /**
     * Accessor for objects of class Room
     * untuk meminta keterangan nomor kamar
     * 
     * @return nomor_kamar.
     */
    public String getNomorKamar(){
        return nomor_kamar;
    }
    
    /**
     * Accessor for objects of class Room
     * untuk meminta keterangan status avalability
     * 
     * @return isAvailable.
     */
    public boolean getStatusAvailable(){
        return isAvailable;
    }
    
    /**
     * Accessor for objects of class Room
     * untuk meminta keterangan tarif
     * 
     * @return dailyTariff.
     */
    public double getDailyTariff(){
        return dailyTariff;
    }
    
     /**
     * Accessor for objects of class Room
     * untuk meminta keterangan status kamar
     * 
     * @return status_kamar.
     */
    public StatusKamar getStatusKamar(){
        return status_kamar;
    }
    
    /**
     * Accessor for objects of class Room
     * untuk meminta keterangan status pesanan
     * 
     * @return pesan.
     */
    public Pesanan getPesanan(){
        return pesan;
    }
    
    /**
     * Accessor for objects of class Room
     * untuk meminta keterangan tipe kamar
     * 
     * @return pesan.
     */
    public abstract TipeKamar getTipeKamar();
    
    public void setHotel(Hotel hotel){
        this.hotel = hotel;
    }
    
    public void setNomorKamar(String nomor_kamar){
        this.nomor_kamar = nomor_kamar;
    }
    
    public void setStatusAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }
    
    public void setDailyTariff(double dailytariff){
        dailyTariff = dailytariff;
    }
    
    public void setStatusKamar(StatusKamar status_kamar){
        this.status_kamar = status_kamar;
    }
    
    public void setPesanan(Pesanan pesan){
        this.pesan = pesan;
    }
    
    /*public void printData(){
        System.out.printf("\nRoom\n");
        System.out.println("Nama Hotel  : " +hotel.getNama());
        System.out.println("Nomor Kamar : " +nomor_kamar);
        System.out.println("Tersedia    : " +isAvailable);
        System.out.println("Harga       : " +dailyTariff);
        System.out.println("Status Kamar: " +status_kamar);
        System.out.println("Tipe Kamar  : " +getTipeKamar());
    }*/
    
    public String toString(){
        return null;
    }
    
}


/**
 * Class Room
 *
 * @author David Raditya K - 1506690372
 * @version 2018.04.12
 */
public abstract class Room
{
    // instance variables - replace the example below with your own
    private Hotel hotel;
    private String nomor_kamar;
    private StatusKamar status_kamar;
    protected double dailyTariff;

    /**
     * Constructor for objects of class Room
     */
    public Room(Hotel hotel, String nomor_kamar, StatusKamar status_kamar)
    {
        // initialise instance variables
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
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

    public void setDailyTariff(double dailytariff){
        dailyTariff = dailytariff;
    }
    
    public void setStatusKamar(StatusKamar status_kamar){
        this.status_kamar = status_kamar;
    }
    
    public String toString(){
        if(true){
            return  "Nama Hotel  : "+hotel.getNama()+
                    "Tipe Kamar  : "+getTipeKamar()+
                    "Harga       : "+dailyTariff+
                    "Status Kamar: "+status_kamar;
        }
        else{
            return  "Nama Hotel  : "+hotel.getNama()+
                    "Tipe Kamar  : "+getTipeKamar()+
                    "Harga       : "+dailyTariff+
                    "Status Kamar: "+status_kamar;
        }
    }
    
}

/**
 * Class PremiumRoom
 *
 * @author David Raditya K - 1506690372
 * @version 2018.03.15
 */
public class PremiumRoom extends Room
{
    private double DISCOUNT = 0.3;
    private TipeKamar TIPE_KAMAR = TipeKamar.PREMIUM;
    
    public PremiumRoom(Hotel hotel, String nomor_kamar){
        super(hotel, nomor_kamar);
    }
    
    public TipeKamar getTipeKamar(){
        return TIPE_KAMAR;
    }
    
    public double getDiscount(){
        return DISCOUNT;
    }
    
    public void setDailyTariff(double dailytariff){
        super.dailyTariff = super.dailyTariff * DISCOUNT;
    }    
}
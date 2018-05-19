package jhotel;
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

    /**
     * Constructor for objects of class PremiumRoom
     *
     * @param hotel objek Hotel
     * @param nomor_kamar berisi nomor kamar
     *
     */
    public PremiumRoom(Hotel hotel, String nomor_kamar){
        super(hotel, nomor_kamar);
        setDailyTariff(700000);
    }

    /**
     * mendaptkan nilai tipe kamar
     *
     * @return TIPE_KAMAR
     */
    public TipeKamar getTipeKamar(){
        return TIPE_KAMAR;
    }

    /**
     * mendapatkan nilai diskon
     *
     * @return DISCOUNT
     */
    public double getDiscount(){
        return DISCOUNT;
    }

    /**
     * menentukan nilai tarif harian
     *
     * @param dailytariff nilai daily tariff
     */
    public void setDailyTariff(double dailytariff){
        dailyTariff = dailytariff*DISCOUNT;;
    }    
}
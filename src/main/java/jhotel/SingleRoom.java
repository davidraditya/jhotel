package jhotel;
/**
 * Class SingleRoom
 *
 * @author David Raditya K - 1506690372
 * @version 2018.05.16
 */
public class SingleRoom extends Room
{
    private static TipeKamar TIPE_KAMAR = TipeKamar.SINGLE;

    /**
     * Constructor for objects of class SingleRoom
     *
     * @param hotel object hotel
     * @param nomor_kamar berisi nomor kamar
     */
    public SingleRoom(Hotel hotel, String nomor_kamar){
        super(hotel, nomor_kamar);
        setDailyTariff(50000);
    }

    /**
     * Method untuk mendapatkan nilai tipe kamar
     *
     * @return TIPE_KAMAR
     */
    public TipeKamar getTipeKamar(){
        return TIPE_KAMAR;
    }

    /**
     * menentukan nilai daily tarif
     *
     * @param dailytariff nilai daily tariff
     */
    public void setDailyTariff(double dailytariff)
    {
        dailyTariff = dailytariff;
    }
}
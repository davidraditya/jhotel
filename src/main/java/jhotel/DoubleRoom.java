package jhotel;
/**
 * Class DoubleRoom
 *
 * @author David Raditya K - 1506690372
 * @version 2018.05.16
 */
public class DoubleRoom extends Room
{
    private Customer customer2;
    private static TipeKamar TIPE_KAMAR = TipeKamar.DOUBLE;

    /**
     * Constructor untuk object dari class DoubleRoom
     *
     * @param hotel objek hotel
     * @param nomor_kamar nomor kamar
     */
    public DoubleRoom(Hotel hotel, String nomor_kamar)
    {
        super(hotel, nomor_kamar);
        setDailyTariff(100000);
    }

    /**
     * Method untuk mengambil nilai objek customer2
     *
     * @return customer2
     */
    public Customer getCustomer2()
    {
        return customer2;
    }

    /**
     * Method untuk mengambil nilai tipe kamar
     *
     * @return TIPE_KAMAR
     */
    public TipeKamar getTipeKamar()
    {
        return TIPE_KAMAR;
    }

    /**
     * Method untuk menentukan nilai objek customer2
     *
     * @param customer2 objek customer2
     */
    public void setCustomer2(Customer customer2)
    {
        this.customer2 = customer2;
    }

    /**
     * Method untuk menentukan daily tarif untuk class DoubleRoom
     *
     * @param dailytariff nilai daily tariff
     */
    public void setDailyTariff(double dailytariff)
    {
        dailyTariff = dailytariff;
    }
}
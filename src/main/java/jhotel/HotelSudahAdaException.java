package jhotel;
/**
 * Class HotelSudahAdaException
 *
 * @author David Raditya K - 1506690372
 * @version 2018.04.19
 */

public class HotelSudahAdaException extends Exception{
    private Hotel hotel_error;

    /**
     * Constructor dari kelas exception HotelSudahAda
     * @param hotel_input nilai pesanan yang dicek.
     */

    public HotelSudahAdaException(Hotel hotel_input)
    {
        super("Hotel dengan nama: ");
        hotel_error = hotel_input;
    }

    /**
     * Method yang digunakan untuk mendapatkan pesan Exception.
     * @return String nilai pesan error.
     */

    public String getPesan()
    {
        return super.getMessage() + hotel_error.getNama() + " sudah terdaftar.";
    }

}

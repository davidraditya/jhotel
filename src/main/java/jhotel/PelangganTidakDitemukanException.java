package jhotel;
/**
 * Class PelangganTidakDitemukanException
 *
 * @author David Raditya K - 1506690372
 * @version 2018.04.19
 */

public class PelangganTidakDitemukanException extends Exception {
    private int pelanggan_error;

    /**
     * Constructor dari kelas exception PelangganTidakDitemukan
     * @param pelanggan_input nilai pesanan yang dicek.
     */

    public PelangganTidakDitemukanException(int pelanggan_input)
    {
        super("Data Customer dengan ID: ");
        pelanggan_error = pelanggan_input;
    }

    /**
     * Method yang digunakan untuk mendapatkan pesan Exception.
     * @return String nilai pesan error.
     */

    public String getPesan()
    {
        return super.getMessage() + pelanggan_error + " tidak ditemukan.";
    }

}

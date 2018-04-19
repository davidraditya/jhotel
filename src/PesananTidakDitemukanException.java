/**
 * Class PesananTidakDitemukanException
 *
 * @author David Raditya K - 1506690372
 * @version 2018.04.19
 */

public class PesananTidakDitemukanException extends Exception {
    private Customer pelanggan_error;

    /**
     * Constructor dari kelas exception PesananTidakDitemukan
     * @param pelanggan_input nilai pesanan yang dicek.
     */

    public PesananTidakDitemukanException(Customer pelanggan_input)
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
        return super.getMessage() + pelanggan_error.getNama() + " tidak ditemukan.";
    }
}

package jhotel;
/**
 * Class Administrasi
 *
 * @author David Raditya K - 1506690372
 * @version 2018.04.12
 */
public class Administrasi
{
    /**
     * Untuk memproses pemesanan kamar hotel.
     *
     * @param pesan berisi objek Pesanan
     * @param kamar berisi objek Room
     */
    public static void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setRoom(kamar);
        //kamar.setStatusKamar(StatusKamar.BOOKED);
        kamar.setStatusKamar(StatusKamar.BOOKED);
    }

    /*
    public static void roomAmbilPesanan(Pesanan pesan, Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.BOOKED);
        //kamar.setPesanan(pesan);
    }
    */

    /*
    public static void roomLepasPesanan(Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.VACANT);
        //kamar.setPesanan(null);
    }
    */

    /**
     * untuk melakukan pembatalan pesanan.
     *
     * @param kamar berisi objek Room
     */
    public static void pesananDibatalkan(Room kamar)
    {
        //Pesanan pesan = kamar.getPesanan();
        //Pesanan pesan = DatabasePesanan.getPesanan(kamar);
        //pesan.setStatusSelesai(false);
        //pesan.setStatusDiproses(false);
        //pesan.setStatusAktif(false);
        //kamar.setPesanan(null);
        kamar.setStatusKamar(StatusKamar.VACANT);
        //roomLepasPesanan(kamar);
    }

    /**
     * untuk menandakan pesanan telah selesai.
     *
     * @param kamar berisi objek Room
     */
    public static void pesananSelesai(Room kamar)
    {
        //Pesanan pesan = kamar.getPesanan();
        Pesanan pesan = DatabasePesanan.getPesanan(kamar);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        //kamar.setPesanan(null);
        //kamar.setStatusKamar(StatusKamar.VACANT);
        roomLepasPesanan(kamar);
    }

    /**
     * untuk melakukan pembatalan pesanan.
     *
     * @param pesan berisi objek Pesanan
     */
    public static void pesananDibatalkan(Pesanan pesan)
    {
        //kamar.setStatusKamar(StatusKamar.VACANT);
        //pesan.getRoom().setStatusKamar(StatusKamar.VACANT);
        roomLepasPesanan(pesan.getRoom());

        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        pesan.setRoom(null);
    }

    public static void roomLepasPesanan(Room kamar){
        kamar.setStatusKamar(StatusKamar.VACANT);
    }

    /**
     * untuk menandakan pesanan telah selesai.
     *
     * @param pesan berisi objek Pesanan
     */
    public static void pesananSelesai(Pesanan pesan)
    {
        //pesan.getRoom().setStatusKamar(StatusKamar.VACANT);
        roomLepasPesanan(pesan.getRoom());
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
    }
}
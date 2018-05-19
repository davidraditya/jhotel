package jhotel;

/**
 * Class Administrasi
 *
 * @author David Raditya K - 1506690372
 * @version 2018.05.16
 */
public class Administrasi
{
    /**
     * Class Administrasi ntuk memproses pemesanan kamar hotel.
     *
     * @param pesan berisi objek Pesanan
     * @param kamar berisi objek Room
     */
    public static void pesananDitugaskan(Pesanan pesan, Room kamar){
        if(pesan != null && kamar != null)
        {
            if(kamar.getStatusKamar() == StatusKamar.VACANT)
            {
                pesan.setStatusSelesai(false);
                pesan.setStatusDiproses(true);
                pesan.setRoom(kamar);

                kamar.setStatusKamar(StatusKamar.BOOKED);
            }
            else {
                pesan.setStatusAktif(false);
            }
        }
    }

    /**
     * untuk melakukan pembatalan pesanan.
     *
     * @param kamar berisi objek Room
     */
    public static void pesananDibatalkan(Room kamar){
        Pesanan pesan = DatabasePesanan.getPesananAktif(kamar);
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);

        kamar.setStatusKamar(StatusKamar.VACANT);
    }

    /**
     * untuk menandakan pesanan telah selesai.
     *
     * @param kamar berisi objek Room
     */
    public static void pesananSelesai(Room kamar){
        Pesanan pesan = DatabasePesanan.getPesananAktif(kamar);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        kamar.setStatusKamar(StatusKamar.VACANT);
    }

    /**
     * untuk melakukan pembatalan pesanan.
     *
     * @param pesan berisi objek Pesanan
     */
    public static void pesananDibatalkan(Pesanan pesan){
        pesan.getRoom().setStatusKamar(StatusKamar.VACANT);
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        pesan.setRoom(null);
    }

    /**
     * untuk menandakan pesanan telah selesai.
     *
     * @param pesan berisi objek Pesanan
     */
    public static void pesananSelesai(Pesanan pesan){
        pesan.getRoom().setStatusKamar(StatusKamar.VACANT);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        pesan.setRoom(null);
    }
}
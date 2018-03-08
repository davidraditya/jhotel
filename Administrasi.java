
/**
 * Class Administrasi
 *
 * @author (David Raditya K - 1506690372)
 * @version (2018.3.8)
 */
public class Administrasi
{
    /**
     * Constructor for objects of class Administrasi
     */
    public Administrasi()
    {
    }

    /**
     *
     */
    public static void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setRoom(kamar);
    }
    
    public static void roomAmbilPesanan(Pesanan pesan, Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.BOOKED);
        kamar.setPesanan(pesan);
    }
    
    public static void roomLepasPesanan(Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.VACANT);
        kamar.setPesanan(null);
    }
    
    public static void pesananDibatalkan(Room kamar)
    {
        Pesanan pesan = kamar.getPesanan();
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        kamar.setPesanan(null);
    }
    
    public static void pesananSelesai(Room kamar)
    {
        Pesanan pesan = kamar.getPesanan();
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        kamar.setPesanan(null);
    }
    
     public static void pesananDibatalkan(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
    }
    
    public static void pesananSelesai(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
    }
}

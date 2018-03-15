
/**
 * Class JHotel (Class utama)
 *
 * @author David Raditya K - 1506690372
 * @version 2018.03.10
 */
public class JHotel
{
    public static void main(String args[])
    {
        System.out.println("Welcome to JHotel");
        
        Lokasi lokasi = new Lokasi(20, 15, "DTE");
        Hotel hotel = new Hotel("GedungK", lokasi, 5);
        Customer customer = new Customer(21, "David");
        Room single = new SingleRoom(hotel, "K301", true, StatusKamar.BOOKED);
        
        Pesanan pesan = new Pesanan(7, customer, single);
        
        single.setDailyTariff(50000);
        pesan.setBiaya();
        
        //mencetak data lokasi customer
        lokasi.printData();
        customer.printData();
        hotel.printData();
        
        System.out.println("\nMethod 1 pesananDitugaskan(pesan, kamar)");
        Administrasi.pesananDitugaskan(pesan, single);
        pesan.printData();
        single.printData();
        
        if (single instanceof DoubleRoom){
            System.out.println("Benar Double Room");
        } else  System.out.println("Salah, bukan Double Room");
        
        Room kamardouble = new DoubleRoom(hotel, "6969", true, StatusKamar.BOOKED);
        Pesanan pesan2 = new Pesanan(88, customer,kamardouble);
        
        kamardouble.setDailyTariff(100000);
        pesan2.setBiaya();
        
        System.out.println("\nMethod 1 pesananDitugaskan(pesan, kamar)");
        Administrasi.pesananDitugaskan(pesan2, kamardouble);
        pesan2.printData();
        kamardouble.printData();
        
        if (kamardouble instanceof DoubleRoom){
            System.out.println("Benar Double Room");
        } else  System.out.println("Salah, bukan Double Room");
       
        
    }
    
    public JHotel(){
    }
}

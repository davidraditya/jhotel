
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
        Lokasi lokasi = new Lokasi(20, 18, "DTE");
        Customer customer = new Customer(21, "David");
        Hotel hotel = new Hotel("GedungK", lokasi, 9);
        Room room = new Room(hotel, "K301", true, customer, 50000, StatusKamar.BOOKED);
        Pesanan pesan = new Pesanan(50000, customer);
        
        System.out.println("Welcome to JHotel");
        lokasi.printData();
        customer.printData();
        hotel.printData();
        
        pesan.setTipeKamar(TipeKamar.SINGLE);
        
        System.out.println("====================Method 1====================");
        Administrasi.pesananDitugaskan(pesan, room);
        pesan.printData();
        room.printData();
        
        System.out.println("====================Method 2====================");
        Administrasi.pesananDibatalkan(room);
        pesan.printData();
        room.printData();
        
        Administrasi.pesananDitugaskan(pesan, room);
        System.out.println("====================Method 3====================");
        Administrasi.pesananDibatalkan(pesan);
        pesan.printData();
        room.printData();
        
        Administrasi.pesananDitugaskan(pesan, room);
        System.out.println("====================Method 4====================");
        Administrasi.pesananSelesai(room);
        pesan.printData();
        room.printData();
        
        Administrasi.pesananDitugaskan(pesan, room);
        System.out.println("====================Method 5====================");
        Administrasi.pesananSelesai(pesan);
        pesan.printData();
        room.printData();
    }
    
    public JHotel(){
    }
}

package jhotel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;
@SpringBootApplication

/**
 *
 * @author David Raditya
 * @version 2018.04.12
 */
// Class ini digunakan untuk program utama JHotel

public class JHotel
{
    /**
     * program utama jHotel
     * 
     * @param args argumen
     */
    public static void main (String[] args){
        SpringApplication.run(JHotel.class, args);
        Lokasi loc1 = new Lokasi(11,11,"depan");
        Lokasi loc2 = new Lokasi(12,12,"samping");

        Hotel hotel1 = new Hotel ("Aston", loc1, 5);
        Hotel hotel2 = new Hotel ("Bolton", loc2, 4);

        Room room1 = new SingleRoom(hotel1, "A1");
        Room room2 = new DoubleRoom(hotel1, "A2");
        Room room3 = new PremiumRoom(hotel2, "A3");

        try{
            DatabaseRoom.addRoom(room1);
            DatabaseRoom.addRoom(room2);
            DatabaseRoom.addRoom(room3);
        }

        catch (RoomSudahAdaException yo){
            System.out.println(yo.getPesan());
        }

        /*System.out.println("Exception have been implemented");
        Customer customer1 = new Customer("Andrew", 01, 01, 2001, "andrew@ui.ac.id");
        Customer customer2 = new Customer("Bianca", 02, 02, 2002, "bianca@ui.ac.id");
        Customer customer3 = new Customer("Callie", 03, 03, 2003, "callie@ui.ac.id");
        Customer customer4 = new Customer("Andrew", 01, 01, 2001, "andrew@ui.ac.id");

        try{
            DatabaseCustomer.addCustomer(customer1);
            DatabaseCustomer.addCustomer(customer2);
            DatabaseCustomer.addCustomer(customer3);
            DatabaseCustomer.addCustomer(customer4);
        }

        catch (PelangganSudahAdaException yo){
            System.out.println(yo.getPesan());
        }

        Hotel hotel1 = new Hotel ("Aston", new Lokasi(11,11,"depan"), 5);
        Hotel hotel2 = new Hotel ("Bolton", new Lokasi(12,12,"tengah"), 4);
        Hotel hotel3 = new Hotel ("Carlton", new Lokasi(13,13,"kanan"), 3);
        Hotel hotel4 = new Hotel ("Daventon", new Lokasi(14,14,"kiri"), 2);
        Hotel hotel5 = new Hotel ("Aston", new Lokasi(11,11,"depan"), 5);

        try{
            DatabaseHotel.addHotel(hotel1);
            DatabaseHotel.addHotel(hotel2);
            DatabaseHotel.addHotel(hotel3);
            DatabaseHotel.addHotel(hotel4);
            DatabaseHotel.addHotel(hotel5);
        }

        catch (HotelSudahAdaException yom){
            System.out.println(yom.getPesan());
        }

        Room room1 = new SingleRoom(hotel1, "A1");
        Room room2 = new DoubleRoom(hotel2, "A2");
        Room room3 = new PremiumRoom(hotel3, "A3");
        Room room4 = new SingleRoom(hotel4, "A4");
        Room room5 = new DoubleRoom(hotel2, "A2");

        /*try{
            DatabaseRoom.addRoom(room1);
            DatabaseRoom.addRoom(room2);
            DatabaseRoom.addRoom(room3);
            DatabaseRoom.addRoom(room4);
            DatabaseRoom.addRoom(room5);
        }

        catch (RoomSudahAdaException yow){
            System.out.println(yow.getPesan());
        }


        Pesanan pesanan1 = new Pesanan(21,customer1);
        Pesanan pesanan2 = new Pesanan(22,customer2);
        Pesanan pesanan3 = new Pesanan(23,customer3);
        Pesanan pesanan4 = new Pesanan(21,customer4);

        try{
            DatabasePesanan.addPesanan(pesanan1);
            DatabasePesanan.addPesanan(pesanan2);
            DatabasePesanan.addPesanan(pesanan3);
            DatabasePesanan.addPesanan(pesanan4);
        }

        catch (PesananSudahAdaException yos){
            System.out.println(yos.getPesan());
        }


        Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(1)), DatabaseRoom.getRoom(DatabaseHotel.getHotel(1), "A1"));
        Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(3)), DatabaseRoom.getRoom(DatabaseHotel.getHotel(2), "B2"));
        Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(2)), DatabaseRoom.getRoom(DatabaseHotel.getHotel(1), "D4"));


        for (Pesanan coba5: DatabasePesanan.getPesananDatabase()){
            System.out.println(coba5);
        }

        Administrasi.pesananDibatalkan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(2)));
        Administrasi.pesananSelesai(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(1)));
        Administrasi.pesananSelesai(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(3)));

        for (Pesanan coba6 :DatabasePesanan.getPesananDatabase()){
            System.out.println(coba6);
        }

*/
        /*Customer customer1 = new Customer("Andrew", 01, 01, 2001, "andrew@ui.ac.id");
        Customer customer2 = new Customer("Bianca", 02, 02, 2002, "bianca@ui.ac.id");
        Customer customer3 = new Customer("Callie", 03, 03, 2003, "callie@ui.ac.id");

        Lokasi loc1 = new Lokasi(11,11,"depan");
        Lokasi loc2 = new Lokasi(12,12,"kanan");
        Lokasi loc3 = new Lokasi(13,13,"kiri");

        Hotel hotel1 = new Hotel ("Aston", loc1, 5);
        Hotel hotel2 = new Hotel ("Bolton", loc2, 4);
        Hotel hotel3 = new Hotel ("Carlton", loc3, 3);

        Room room1 = new SingleRoom(hotel1, "A1");
        Room room4 = new PremiumRoom(hotel1, "A4");
        Room room2 = new DoubleRoom(hotel2, "A2");
        Room room3 = new PremiumRoom(hotel3, "A3");

        Pesanan pesan1 = new Pesanan(21, customer1);
        Pesanan pesan2 = new Pesanan(22, customer2);
        Pesanan pesan3 = new Pesanan(23, customer3);
        Pesanan pesan4 = new Pesanan(23, customer1);

        Administrasi.pesananDitugaskan(pesan1, room1);
        Administrasi.pesananDitugaskan(pesan2, room2);
        Administrasi.pesananDitugaskan(pesan3, room3);

        System.out.println("Test RoomTidakDitemukanException");
        try {
            DatabaseRoom.removeRoom(hotel1, "A101");
        } catch (RoomTidakDitemukanException test) {
            System.out.println(test.getPesan());
        }
        try {
            DatabaseRoom.removeRoom(hotel1, "A101");
        } catch (RoomTidakDitemukanException test) {
            System.out.println(test.getPesan());
        }

        Administrasi.pesananSelesai(pesan1);
        Administrasi.pesananSelesai(pesan2);
        Administrasi.pesananDibatalkan(pesan3);

        System.out.println("Test HotelTidakDitemukanException");
        try {
            DatabaseHotel.removeHotel(5);
        } catch (HotelTidakDitemukanException test) {
            System.out.println(test.getPesan());
        }

        System.out.println("Test PelangganTidakDitemukanException");
        try {
            DatabaseCustomer.removeCustomer(5);
        } catch (PelangganTidakDitemukanException test){
            System.out.println(test.getPesan());
        }

        System.out.println("Test PesananTidakDitemukanException");
        try {
            DatabasePesanan.removePesanan(customer3);
        } catch (PesananTidakDitemukanException test) {
            System.out.println(test.getPesan());
        }
        try {
            DatabasePesanan.removePesanan(customer3);
        } catch (PesananTidakDitemukanException test) {
            System.out.println(test.getPesan());
        }*/


    }
    
    public JHotel(){
        
    }
}

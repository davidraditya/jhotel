
/**
 * Class Pesanan
 *
 * @author (David Raditya K - 1506690372)
 * @version (2018.2.22)
 */
public class JHotel
{
    public static void main(String[] args)
    {
        Customer pelanggan = new Customer(7,"David");
        Lokasi geo = new Lokasi(3, 5, "deskripsi lokasi saya");
        Hotel brand = new Hotel("grand indonesia", geo, 5);
        Pesanan order = new Pesanan(3000000, pelanggan);
        
        pelanggan.printData();
        order.printData();
        brand.printData();
        
        pelanggan.setNama("Kak Kiel");
        pelanggan.printData();
        order.printData();
        brand.printData();
        
    }
    
    public JHotel(){
    }
}

/**
 * Class DoubleRoom
 *
 * @author David Raditya K - 1506690372
 * @version 2018.03.15
 */
public class DoubleRoom extends Room
{
    private Customer customer2;
    private TipeKamar TIPE_KAMAR = TipeKamar.DOUBLE;
    
    public DoubleRoom(Hotel hotel, String nomor_kamar, boolean isAvailable, StatusKamar status_kamar){
        super(hotel, nomor_kamar, isAvailable, status_kamar);
    }
    
    public Customer getCustomer2(){
        return customer2;
    }
    
    public TipeKamar getTipeKamar(){
        return TIPE_KAMAR;
    }
    
    public void setCustomer(Customer customer2){
        this.customer2 = customer2;
    }    
}
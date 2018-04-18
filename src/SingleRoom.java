
/**
 * Class SingleRoom
 *
 * @author David Raditya K - 1506690372
 * @version 2018.03.15
 */
public class SingleRoom extends Room
{
    private TipeKamar TIPE_KAMAR = TipeKamar.SINGLE;
    
    public SingleRoom(Hotel hotel, String nomor_kamar){
        super(hotel, nomor_kamar);
    }
    
    public TipeKamar getTipeKamar(){
        return TIPE_KAMAR;
    }
}

/**
 * Enumeration class TipeKamar
 *
 * @author (David Raditya K - 1506690372)
 * @version (2018.8.1)
 */
//membuat enum untuk menentukan Tipe Kamar
public enum TipeKamar
{
    //Nama enum yang diberikan
    SINGLE("Single"),
    DOUBLE("Double"),
    PREMIUM("Premium");
    
    //mendeklarasi variabel
    private String tipe;
    /**
     * Constructor for TipeKamar
     * 
     * @param tipe tipe kamar
     * 
     */
    TipeKamar(String tipe){
        this.tipe=tipe;
    }
    
    /**
     * pengembalian nilai enum yang dipanggil
     * 
     * @return tipe tipe kamar
     * 
     */
    public String toString(){
        return tipe;
    }
    
}


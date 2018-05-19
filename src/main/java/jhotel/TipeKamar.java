package jhotel;
/**
 * Enumeration class TipeKamar
 *
 * @author David Raditya K - 1506690372
 * @version 2018.03.10
 */
//membuat enum untuk menentukan Tipe Kamar
public enum TipeKamar
{
    //Nama enum yang diberikan
    SINGLE("Single"),
    DOUBLE("Double"),
    PREMIUM("Premium");
    
    //mendeklarasi variabel
    private String deskripsi;
    /**
     * Constructor for TipeKamar
     * 
     * @param deskripsi tipe kamar
     * 
     */
    TipeKamar(String deskripsi)
    {
        this.deskripsi = deskripsi;
    }
    
    /**
     * pengembalian nilai enum yang dipanggil
     * 
     * @return deskripsi tipe kamar
     * 
     */
    public String toString()
    {
        return deskripsi;
    }
    
}


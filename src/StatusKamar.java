
/**
 * Enumeration class StatusKamar
 *
 * @author David Raditya K - 1506690372
 * @version 2018.03.10
 */
//membuat enum untuk menentukan Status Kamar
public enum StatusKamar
{
    //Nama enum yang diberikan
    BOOKED("Booked"),
    PROCESSED("Processed"),
    VACANT("Vacant");
    
    //mendeklarasi variabel
    private String status;
    /**
     * Constructor for StatusKamar
     * 
     * @param status status kamar
     * 
     */
    StatusKamar(String status){
        this.status=status;
    }
    
    /**
     * pengembalian nilai enum yang dipanggil
     * 
     * @return status status kamar
     * 
     */
    public String toString(){
        return status;
    }
    
}


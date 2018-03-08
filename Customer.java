
/**
 * Class Pesanan
 *
 * @author (David Raditya K - 1506690372)
 * @version (2018.3.1)
 */
public class Customer
{
    // deklarasi variabel
    protected int id;
    protected String nama;

    /**
     * Constructor for objects of class Customer
     * 
     * @param id, nama.
     */
    public Customer(int id, String nama)
    {
        this.id = id;
        this.nama = nama;
    }

    /**
     * Accessor for objects of class Customer
     * untuk meminta id
     * 
     * @return id.
     */
    public int getID(){
        return id;
    }
    
    /**
     * Accessor for objects of class Customer
     * untuk meminta nama
     * 
     * @return nama.
     */
    public String getNama(){
        return nama;
    }
    
    /**
     * Mutator for objects of class Customer
     * untuk memberi id
     * 
     * @return id.
     */
    public void setID(int id){
        this.id = id;
    }
    
    /**
     * Mutator for objects of class Customer
     * untuk memberi nama
     * 
     * @return nama.
     */
    public void setNama(String nama){
        this.nama = nama;
    }
    
    /*
     * Untuk mencetak data
     */
    public void printData(){
        System.out.printf("Nama Customer %s\n", nama);
    }
}

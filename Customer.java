import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Class Customer
 *
 * @author David Raditya K - 1506690372
 * @version 2018.03.22
 */
public class Customer
{
    // deklarasi variabel
    protected int id;
    protected String nama;
    protected String email;
    protected Date dob;
    
    /**
     * Constructor for objects of class Customer
     * 
     * @param id, nama.
     */
    public Customer(int id, String nama, int tanggal, int bulan, int tahun)
    {
        this.id = id;
        this.nama = nama;
        Date dob = new Date(tahun, bulan, tanggal);
    }

    /**
     * Constructor for objects of class Customer
     * 
     * @param id, nama.
     */
    public Customer(int id, String nama, Date dob)
    {
        this.id = id;
        this.nama = nama;
        this.dob = dob;
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
     * Accessor for objects of class Customer
     * untuk meminta email
     * 
     * @return email.
     */
    public String getEmail(){
        return email;
    }
    
    /**
     * Accessor for objects of class Customer
     * untuk meminta tanggal lahir
     * 
     * @return dob.
     */
    public Date getDOB(){
        return dob;
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
    
    /**
     * Mutator for objects of class Customer
     * untuk memberi email
     * 
     * @return email.
     */
    public void setEmail(String email){
        String pattern = 
            "^[_&*_~A-Za-z0-9-\\+]+(\\.[_&*_~A-Za-z0-9-]+)*@[A-Za-z0-9][A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(email);
        
        if (m.matches()){
            this.email = email;
        }
    }
    
    /**
     * Mutator for objects of class Customer
     * untuk memberi tanggal lahir
     * 
     * @return dob.
     */
    public void setDOB(Date dob){
        this.dob = dob;
    }
    
    /*
     * Untuk mencetak data
     *
    public void printData(){
        System.out.printf("\nCustomer\n");
        System.out.println("ID: " +id);
        System.out.println("Nama: " +nama);
    }*/
    
    public String toString(){
        return null;
    }
}

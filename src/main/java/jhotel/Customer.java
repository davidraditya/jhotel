package jhotel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Class Customer untuk membuat model Customer
 *
 * @author David Raditya K - 1506690372
 * @version 2018.05.16
 */
public class Customer
{
    private int id;
    private String nama;
    private String email;
    private Date dob;
    private String password;
    private static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[_A-Za-z0-9-+]+(\\.[_A-Za-z0-9-]+)*@"
                    +"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", Pattern.CASE_INSENSITIVE);

    /**
     * Overloading Constructor untuk object dari class Customer.
     *
     * @param nama berisi nama Customer
     * @param tanggal berisi tanggal
     * @param bulan berisi bulan
     * @param tahun berisi tahun
     */
    public Customer(String nama, int tanggal, int bulan, int tahun, String email, String password){
        id = DatabaseCustomer.getLastCustomerID()+1;
        this.nama = nama;
        this.dob = new GregorianCalendar(tahun,bulan-1,tanggal).getTime();
        this.email = email;
        this.password = password;
    }

    /**
     * Overloading Constructor untuk object dari class Customer.
     *
     * @param nama berisi nama customer.
     * @param dob berisi objek Date.
     */
    public Customer(String nama, Date dob, String email, String password){
        id = DatabaseCustomer.getLastCustomerID()+1;
        this.nama = nama;
        this.dob = dob;
        this.email = email;
        this.password = password;
    }

    /**
     * Accessor untuk object dari class Customer
     * untuk mendapatkan nilai ID.
     *
     * @return id
     */
    public int getID(){
        return id;
    }

    /**
     * Accessor untuk object dari class Customer
     * untuk mendapatkan nilai nama.
     *
     * @return nama
     */
    public String getNama(){
        return nama;
    }

    /**
     * Accessor untuk object dari class Customer
     * untuk mendapatikan email.
     *
     * @return email
     */
    public String getEmail(){
        return email;
    }

    /**
     * Accessor untuk object dari class Customer
     * untuk mendapatkan nilai tanggal bertipe Date
     *
     * @return dob
     */
    public Date getDOB(){
        return dob;
    }

    /**
     * Accessor untuk object dari class Customer
     * untuk mendapatkan password
     *
     * @return password
     */
    public String getPassword(){
        return password;
    }

    /**
     * Mutator untuk object dari class Customer
     * untuk menentukan nilai id.
     *
     * @param id berisi id.
     */
    public void setID(int id)
    {
        this.id = id;
    }

    /**
     * Mutator untuk object dari class Customer
     * untuk menentukan nilai id.
     *
     * @param nama berisi nama.
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }

    /**
     * Mutator untuk object dari class Customer
     * untuk menentukan nilai email.
     *
     * @param email
     */
    public void setEmail(String email){
        if(validate(email)){
            this.email = email;
            System.out.println("Email: "+email+" valid");
        }
        else{
            this.email = email;
            System.out.println("Email: "+email+" tidak valid");
        }
    }

    /**
     * Mutator untuk object dari class Customer
     * untuk validasi pattern email.
     *
     * @param emailStr
     * berisi email yang ingin divaildasi.
     *
     * @return mathcer.find()
     */
    public static boolean validate(String emailStr){
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }

    /**
     * Mutator untuk object dari class Customer
     * untuk menentukan nilai tanggal
     *
     * @param dob
     * objek Date
     */
    public void setDOB(Date dob){
        this.dob = dob;
    }

    /**
     * Mutator untuk object dari class Customer
     * untuk menentukan password user
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * untuk mencetak String pada objek Customer
     *
     */
    public String toString()
    {
        if(DatabasePesanan.getPesananAktif(this) != null){
            return "\nCustomer\n"+
                    "\nCustomer ID   : " +id+
                    "\nName          : " +nama+
                    "\nE-Mail        : " +email+
                    "\nDate of Birth : " +getDOB()+
                    "\nBooking order is in progress";
        }

        else{
            return "\nCustomer\n"+
                    "\nCustomer ID   : " +id+
                    "\nName          : " +nama+
                    "\nE-Mail        : " +email+
                    "\nDate of Birth : " +getDOB();
        }
    }
}
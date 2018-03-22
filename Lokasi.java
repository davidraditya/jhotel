
/**
 * Class Pesanan
 *
 * @author David Raditya K - 1506690372
 * @version 2018.03.22
 */
public class Lokasi
{
    // deklarasi variabel
    private float x_coord;
    private float y_coord;
    private String deskripsiLokasi;
    

    /**
     * Constructor for objects of class Lokasi
     * 
     * @param x_coord, y_coord, deskripsiLokasi.
     */
    public Lokasi(float x_coord, float y_coord, String deskripsiLokasi)
    {
        // instance variables
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.deskripsiLokasi = deskripsiLokasi;
    }

    /**
     * Accessor for objects of class Lokasi
     * untuk meminta nilai x
     * 
     * @return x_coord.
     */
    public float getX(){
        return x_coord;
    }
    
    /**
     * Accessor for objects of class Lokasi
     * untuk meminta nilai y
     * 
     * @return y_coord.
     */
    public float getY(){
        return y_coord;
    }
    
    /**
     * Accessor for objects of class Lokasi
     * untuk meminta deskripsi lokasi
     * 
     * @return deskripsiLokasi.
     */
    public String getDeskripsi(){
        return deskripsiLokasi;
    }
    
    /**
     * Mutator for objects of class Lokasi
     * untuk memberi nilai x
     * 
     * @param x_coord.
     */
    public void setX(float x_coord){
        this.x_coord = x_coord;
    }
    
    /**
     * Mutator for objects of class Lokasi
     * untuk memberi nilai y
     * 
     * @param y_coord.
     */
    public void setY(float y_coord){
        this.y_coord = y_coord;
    }
    
    /**
     * Mutator for objects of class Lokasi
     * untuk memberi deskripsi lokasi
     * 
     * @param deskripsi.
     */
    public void setDeskripsi(String deskripsi){
        deskripsiLokasi = deskripsi;
    }
    
    /*
     * Untuk mencetak data
     *
    public void printData(){
        System.out.printf("\nLokasi\n");
        System.out.println("Koordinat X: " +x_coord);
        System.out.println("Koordinat Y: " +y_coord);
        System.out.println("Deskripsi: " +deskripsiLokasi);
    }*/
    
    public String toString()
    {
        return  "\nKoordinat X adalah " +x_coord +
                "\nKoordinat Y adalah " +y_coord +
                "\nDeskripsi adalah " +deskripsiLokasi;
    }
}

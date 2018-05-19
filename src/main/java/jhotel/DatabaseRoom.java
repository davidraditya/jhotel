package jhotel;
import java.util.ArrayList;

/**
 * Class DatabaseRoom
 *
 * @author David Raditya K - 1506690372
 * @version 2018.04.12
 */
public class DatabaseRoom
{
    private static ArrayList<Room> ROOM_DATABASE = new ArrayList<>();

    /**
     * Method yang digunakan untuk mengembalikan database kamar.
     * @return ArrayList<Room> mengembalikan database kamar.
     */

    public static ArrayList<Room> getRoomDatabase()
    {
        return ROOM_DATABASE;
    }

    /**
     * Method yang digunakan untuk menambahkan kamar kedalam database.
     * @param baru input customer yang akan dimasukkan kedalam database
     * @return boolean mengembalikan apakah penambahan berhasil atau tidak.
     */

    public static boolean addRoom(Room baru) throws RoomSudahAdaException
    {
        for(Room kamar : ROOM_DATABASE){
            if(kamar.getHotel().equals(baru.getHotel()) && kamar.getNomorKamar().equals(baru.getNomorKamar())){
                throw new RoomSudahAdaException(baru);
                //return false;
            }
        }
        ROOM_DATABASE.add(baru);
        return true;
    }

    /**
     * Method yang digunakan untuk mencari kamar dari database.
     * @param hotel
     * @param nomor_kamar input customer yang akan dimasukkan kedalam database
     * @return kamar
     */

    public static Room getRoom(Hotel hotel, String nomor_kamar)
    {
        for(Room kamar : ROOM_DATABASE){
            if(kamar.getHotel().equals(hotel) && kamar.getNomorKamar().equals(nomor_kamar)){
                return kamar;
            }
        }
        return null;
    }

    /**
     * Method yang digunakan untuk mengambil ArrayList room yang berasal dari hotel
     *
     * @param hotel berisi objek Hotel
     * @return tempRoom
     */

    public static ArrayList<Room> getRoomsFromHotel(Hotel hotel)
    {
        ArrayList<Room> tempRoom = new ArrayList<>();

        for(Room kamar : ROOM_DATABASE){
            if(kamar.getHotel().equals(hotel)){
                tempRoom.add(kamar);
            }
        }
        return tempRoom;
    }

    /**
     * Method yang digunakan untuk mencari kamar kosong dari database.
     *
     * @return tempRoom
     */

    public static ArrayList<Room> getVacantRooms()
    {
        ArrayList<Room> tempRoom = new ArrayList<>();

        for(Room kamar : ROOM_DATABASE){
            if(kamar.getStatusKamar().equals(StatusKamar.VACANT)){
                tempRoom.add(kamar);
            }
        }
        return tempRoom;
    }

    /**
     * Method yang digunakan untuk menghapus kamar dari dalam database.
     * @param hotel
     * @param nomor_kamar
     * input nomor kamar yang akan dihapus dari database
     *
     * @return true
     */

    public static boolean removeRoom(Hotel hotel, String nomor_kamar) throws RoomTidakDitemukanException
    {
        for(Room kamar : ROOM_DATABASE)
        {
            if(kamar.getHotel().equals(hotel) && kamar.getNomorKamar().equals(nomor_kamar)){
                Administrasi.pesananDibatalkan(kamar);
                if(ROOM_DATABASE.remove(kamar)){
                    return true;
                }
            }
        }
        throw new RoomTidakDitemukanException(hotel, nomor_kamar);
    }
}

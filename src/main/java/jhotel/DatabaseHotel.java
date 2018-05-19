package jhotel;

import java.util.ArrayList;

/**
 * Class DatabaseHotel berisi database tenant
 *
 * @author David Raditya K - 1506690372
 * @version 2018.05.16
 */
public class DatabaseHotel
{
    private static ArrayList<Hotel> HOTEL_DATABASE = new ArrayList<Hotel>();
    private static int LAST_HOTEL_ID = 0;

    /**
     * Method untuk membuat arraylist berisi hotel
     *
     * @return HOTEL_DATABASE
     */
    public static ArrayList<Hotel> getHotelDatabase()
    {
        return HOTEL_DATABASE;
    }

    public static int getLastHotelID()
    {
        return LAST_HOTEL_ID;
    }

    /**
     * Method untuk menambah data Hotel baru
     *
     * @param baru
     *
     */
    public static boolean addHotel(Hotel baru) throws HotelSudahAdaException
    {
        for(Hotel hotel : HOTEL_DATABASE){
            if(hotel.getID() == baru.getID() || (hotel.getNama().equals(baru.getNama()) && hotel.getLokasi().equals(baru.getLokasi()))){
                throw new HotelSudahAdaException(baru);
                //return false;
            }
        }
        HOTEL_DATABASE.add(baru);
        LAST_HOTEL_ID = baru.getID();
        return true;
    }

    /**
     * Method untuk mendapatkan hotel dengan id yang ditentukan
     *
     * @param id
     * @return hotel
     */
    public static Hotel getHotel(int id)
    {
        for(Hotel hotel : HOTEL_DATABASE){
            if(hotel.getID() == id){
                return hotel;
            }
        }
        return null;
    }

    /**
     * Method untuk menghapus data hotel.
     *
     * @return false
     */
    public static boolean removeHotel(int id) throws HotelTidakDitemukanException
    {
        for(Hotel hotel : HOTEL_DATABASE) {
            if (hotel.getID() == id) {
                ArrayList<Room> LIST_ROOM = DatabaseRoom.getRoomsFromHotel(hotel);
                for (Room kamar : LIST_ROOM){
                    try {
                        DatabaseRoom.removeRoom(hotel, kamar.getNomorKamar());
                    }
                    catch (RoomTidakDitemukanException e){
                        System.out.println(e.getPesan());
                    }
                }
                if (HOTEL_DATABASE.remove(hotel)){
                    return true;
                }

            }
        }
        return false;
    }
}

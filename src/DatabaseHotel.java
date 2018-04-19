import java.util.ArrayList;
/**
 * Class DatabaseHotel
 *
 * @author David Raditya K - 1506690372
 * @version 2018.04.12
 */
public class DatabaseHotel
{
    /*
     * Deklarasi variable
     */
    private static ArrayList<Hotel> HOTEL_DATABASE = new ArrayList<Hotel>();
    private static int LAST_HOTEL_ID = 0;

    /**
     * Metode untuk menambah Hotel
     *
     * @param baru hotel baru
     *
     */
    public static boolean addHotel(Hotel baru) throws HotelSudahAdaException{
        for (int i = 0; i < HOTEL_DATABASE.size(); i++) {
            Hotel coba = HOTEL_DATABASE.get(i);
            if (coba.getID()==baru.getID() || (coba.getNama()==baru.getNama() && coba.getLokasi()==baru.getLokasi())){
                throw new HotelSudahAdaException(coba);
            }
        }
        LAST_HOTEL_ID=baru.getID();
        HOTEL_DATABASE.add(baru);
        return true;
    }

    /**
     * Metode untuk menghapus hotel
     *
     * @return LAST_HOTEL_ID id hotel
     *
     */
    public static int getLastHotelId(){
        return LAST_HOTEL_ID;
    }

    /**
     * Metode untuk menghapus hotel
     *
     * @param id id hotel
     *
     */
    public static boolean removeHotel(int id) throws HotelTidakDitemukanException
    {
        for (int i = 0; i < HOTEL_DATABASE.size(); i++) {
            Hotel tes = HOTEL_DATABASE.get(i);
            if (tes.getID()==id){
                ArrayList<Room> KAMAR_TEST = DatabaseRoom.getRoomsFromHotel(tes);
                for (int x = 0; x < KAMAR_TEST.size(); x++){
                    Room kamar = KAMAR_TEST.get(x);
                    try {
                        DatabaseRoom.removeRoom(tes, kamar.getNomorKamar());
                    } catch (RoomTidakDitemukanException test){
                        System.out.println(test.getPesan());
                    }
                }
                if(HOTEL_DATABASE.remove(tes))
                {
                    return true;
                }
            }
        }
        throw new HotelTidakDitemukanException(id);
    }

    public static Hotel getHotel(int id){
        for (int i = 0; i < HOTEL_DATABASE.size(); i++) {
            Hotel tes = HOTEL_DATABASE.get(i);
            if (tes.getID()==id){
                return tes;
            }
        }
        return null;
    }
    /**
     * Metode untuk mengambil data di database
     *
     */
    public static ArrayList<Hotel> getHotelDatabase()
    {
        return HOTEL_DATABASE;
    }
}

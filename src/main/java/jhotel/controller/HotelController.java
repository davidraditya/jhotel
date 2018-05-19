package jhotel.controller;

import jhotel.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class HotelController {
    @RequestMapping("/hotel")
    public ArrayList<Hotel> hotelList()
    {
        return DatabaseHotel.getHotelDatabase();
    }

    @RequestMapping("/hotel/{id}")
    public Hotel getHotel(@PathVariable int id) {
        return DatabaseHotel.getHotel(id);
    }
}

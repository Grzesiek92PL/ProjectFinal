package com.example.projectfinal.Hotel;

import org.springframework.stereotype.Controller;

@Controller
public class HotelController {
    private final HotelServices hotelServices;

    public HotelController(HotelServices hotelServices) {
        this.hotelServices = hotelServices;
    }
}

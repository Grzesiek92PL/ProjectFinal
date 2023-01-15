package com.example.projectfinal.hotels;

import com.example.projectfinal.city.CityServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HotelController {

    private HotelServices hotelServices;
    private CityServices cityServices;

    public HotelController(HotelServices hotelServices, CityServices cityServices) {
        this.hotelServices = hotelServices;
        this.cityServices = cityServices;
    }

    public String hotels(Model model) {

    }
}


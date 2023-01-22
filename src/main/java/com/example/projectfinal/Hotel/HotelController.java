package com.example.projectfinal.Hotel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HotelController {
    private final HotelServices hotelServices;

    public HotelController(HotelServices hotelServices) {
        this.hotelServices = hotelServices;
    }

    @GetMapping("/hotel")
    public String getHotelList(Model model) {
        List<HotelDto> hotelList = hotelServices.getHotels();
        model.addAttribute("hotels", hotelList);
        return "hotel";
    }
}

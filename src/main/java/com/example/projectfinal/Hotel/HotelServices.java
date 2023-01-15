package com.example.projectfinal.Hotel;

import org.springframework.stereotype.Service;

@Service
public class HotelServices {

    private final HotelRepository hotelRepository;

    public HotelServices(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }
}

package com.example.projectfinal.Hotel;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServices {

    private final HotelRepository hotelRepository;

    public HotelServices(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public List<HotelDto> getHotels() {
        List<Hotel> allHotels = hotelRepository.findAll();
        return allHotels.stream().map(h -> {
            HotelDto hotelDto = new HotelDto();
            hotelDto.setId((h.getId()));
            hotelDto.setName(h.getName());
            hotelDto.setRating((long) h.getRating());
            hotelDto.setDescription(h.getDescription());
            return hotelDto;
        }).toList();
    }


}


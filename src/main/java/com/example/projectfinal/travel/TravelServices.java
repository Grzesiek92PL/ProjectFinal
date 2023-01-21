package com.example.projectfinal.travel;

import com.example.projectfinal.Hotel.HotelRepository;
import com.example.projectfinal.airport.AirportRepository;
import com.example.projectfinal.city.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelServices {

    private final TravelRepository travelRepository;
    private final AirportRepository airportRepository;
    private final HotelRepository hotelRepository;
    private final CityRepository cityRepository;

    public TravelServices(TravelRepository travelRepository, AirportRepository airportRepository, HotelRepository hotelRepository, CityRepository cityRepository) {
        this.travelRepository = travelRepository;
        this.airportRepository = airportRepository;
        this.hotelRepository = hotelRepository;
        this.cityRepository = cityRepository;
    }


    public List<TravelDto> getTravels() {
        List<Travel> allTravels = travelRepository.findAll();
        return allTravels.stream().map(t -> {
            TravelDto travelDto = new TravelDto();
            travelDto.setId(t.getId());
            travelDto.setName(t.getName());
            travelDto.setFromCityId(t.getFromCity().getId());
            return travelDto;
        }).toList();
    }
}

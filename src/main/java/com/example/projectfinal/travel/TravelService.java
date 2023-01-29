package com.example.projectfinal.travel;

import com.example.projectfinal.Hotel.HotelRepository;
import com.example.projectfinal.airport.AirportRepository;
import com.example.projectfinal.city.City;
import com.example.projectfinal.city.CityRepository;
import com.example.projectfinal.continent.ContinentRepository;
import com.example.projectfinal.country.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TravelService {

    private final TravelRepository travelRepository;
    private final AirportRepository airportRepository;
    private final HotelRepository hotelRepository;
    private final CityRepository cityRepository;

    private final ContinentRepository continentRepository;
    private final CountryRepository countryRepository;

    public TravelService(TravelRepository travelRepository, AirportRepository airportRepository, HotelRepository hotelRepository, CityRepository cityRepository, ContinentRepository continentRepository, CountryRepository countryRepository) {
        this.travelRepository = travelRepository;
        this.airportRepository = airportRepository;
        this.hotelRepository = hotelRepository;
        this.cityRepository = cityRepository;
        this.continentRepository = continentRepository;
        this.countryRepository = countryRepository;
    }

    public List<TravelDto> getTravels() {
        List<Travel> allTravels = travelRepository.findAll();
        return allTravels.stream().map(t -> {
            TravelDto travelDto = new TravelDto();
            travelDto.setId(t.getId());
            travelDto.setName(t.getName());
            travelDto.setDescription(t.getDescription());
            travelDto.setFromCityName(t.getFromCity().getName());
            travelDto.setFromCityName(t.getFromCity().getName());
            travelDto.setToCityName(t.getToCity().getName());
            travelDto.setFromAirportName(t.getFromAirport().getName());
            travelDto.setToAirportName(t.getToAirport().getName());
            travelDto.setToHotelName(t.getToHotel().getName());
            travelDto.setCountryName(t.getToCountry().getName());
            travelDto.setTourPrice(t.getTourPrice());
            travelDto.setTravelDateFrom(t.getDateFrom());
            travelDto.setTravelDateTo(t.getDateTo());
            return travelDto;
        }).toList();
    }

    public TravelDto findTravelById(Long id) {
        Optional<Travel> byId = travelRepository.findById(id);
        TravelDto travelDto = new TravelDto();
        if (byId.isPresent()) {
            Travel t = byId.get();
            travelDto.setId(t.getId());
            travelDto.setName(t.getName());
            travelDto.setDescription(t.getDescription());
            travelDto.setFromCityName(t.getFromCity().getName());
            travelDto.setFromCityName(t.getFromCity().getName());
            travelDto.setToCityName(t.getToCity().getName());
            travelDto.setFromAirportName(t.getFromAirport().getName());
            travelDto.setToAirportName(t.getToAirport().getName());
            travelDto.setToHotelName(t.getToHotel().getName());
            travelDto.setCountryName(t.getToCountry().getName());
            travelDto.setTourPrice(t.getTourPrice());
            travelDto.setTravelDateFrom(t.getDateFrom());
            travelDto.setTravelDateTo(t.getDateTo());
        }
        return travelDto;
        
    }

    public void editTravel(TravelDto dto) {
    }


    public void addTravel(TravelDto dto) {
        Travel travel = new Travel();
        travel.setName(dto.getName());
        City fromCity = cityRepository.findByName(dto.getFromCityName());
        travel.setFromCity(fromCity);

    }
}



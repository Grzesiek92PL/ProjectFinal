package com.example.projectfinal.airport;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportServices {

    private final AirportRepository airportRepository;

    public AirportServices(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }

    public List<AirportDto> getAirports() {
        List<Airport> allAirports = airportRepository.findAll();
        return allAirports.stream().map(a -> {
            AirportDto airportDto = new AirportDto();
            airportDto.setId(a.getId());
            airportDto.setName(a.getName());
            return airportDto;
        }).toList();
    }
}

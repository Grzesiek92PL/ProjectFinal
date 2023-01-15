package com.example.projectfinal.airport;

import org.springframework.stereotype.Service;

@Service
public class AirportServices {

    private final AirportRepository airportRepository;

    public AirportServices(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }
}

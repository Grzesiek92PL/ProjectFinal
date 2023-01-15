package com.example.projectfinal.airport;

import org.springframework.stereotype.Controller;

@Controller
public class AirportController {

    private final AirportServices airportServices;


    public AirportController(AirportServices airportServices) {
        this.airportServices = airportServices;
    }
}

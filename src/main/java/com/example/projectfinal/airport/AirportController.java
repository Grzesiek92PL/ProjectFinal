package com.example.projectfinal.airport;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class AirportController {
    private final AirportServices airportServices;

    public AirportController(AirportServices airportServices) {
        this.airportServices = airportServices;

    }

    public String airports(Model model) {


    }
}

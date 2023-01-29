package com.example.projectfinal.airport;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AirportController {

    private final AirportServices airportServices;


    public AirportController(AirportServices airportServices) {
        this.airportServices = airportServices;
    }

    @GetMapping("/airport")
    public String getAirportList(Model model) {
        List<AirportDto> airportList = airportServices.getAirports();
        model.addAttribute("airports", airportList);
        return "views/airport";
    }
}

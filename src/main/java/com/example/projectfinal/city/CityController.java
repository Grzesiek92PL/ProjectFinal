package com.example.projectfinal.city;

import org.springframework.stereotype.Controller;

@Controller
public class CityController {
    private final CityServices cityServices;


    public CityController(CityServices cityServices) {
        this.cityServices = cityServices;
    }
}


package com.example.projectfinal.city;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class CityController {

    private final CityServices cityServices;

    public CityController(CityServices cityServices) {
        this.cityServices = cityServices;
    }

    public String cities(Model model) {

    }
}

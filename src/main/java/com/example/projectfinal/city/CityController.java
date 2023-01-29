package com.example.projectfinal.city;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CityController {
    private final CityServices cityServices;


    public CityController(CityServices cityServices) {
        this.cityServices = cityServices;
    }

    @GetMapping("/city")
    public String getCityList(Model model) {
        List<CityDto> cityList = cityServices.getCities();
        model.addAttribute("cities", cityList);
        return "views/city";
    }
}



package com.example.projectfinal.country;

import org.springframework.stereotype.Controller;

@Controller
public class CountryController {

    private final CountryServices countryServices;

    public CountryController(CountryServices countryServices) {
        this.countryServices = countryServices;
    }
}

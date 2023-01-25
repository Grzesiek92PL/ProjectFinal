package com.example.projectfinal.country;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CountryController {
    private final CountryServices countryServices;

    public CountryController(CountryServices countryServices) {
        this.countryServices = countryServices;
    }

    @GetMapping("/country")
    public String getCountryList(Model model) {
        List<CountryDto> countryList = countryServices.getCountry();
        model.addAttribute("countries", countryList);
        return "views/country";
    }
}


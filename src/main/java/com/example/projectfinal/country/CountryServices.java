package com.example.projectfinal.country;

import org.springframework.stereotype.Service;

@Service
public class CountryServices {

    private final CountryRepository countryRepository;

    public CountryServices(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }
}

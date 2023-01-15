package com.example.projectfinal.city;

import org.springframework.stereotype.Service;

@Service
public class CityServices {
    private final CityRepository cityRepository;

    public CityServices(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }
}

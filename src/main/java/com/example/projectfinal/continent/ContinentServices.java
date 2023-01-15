package com.example.projectfinal.continent;

import org.springframework.stereotype.Service;

@Service
public class ContinentServices {

    private final ContinentRepository continentRepository;

    public ContinentServices(ContinentRepository continentRepository) {
        this.continentRepository = continentRepository;
    }
}

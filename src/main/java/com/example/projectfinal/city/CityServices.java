package com.example.projectfinal.city;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServices {
    private final CityRepository cityRepository;

    public CityServices(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public List<CityDto> getCities() {
        List<City> allCities = cityRepository.findAll();
        return allCities.stream().map(c -> {
            CityDto cityDto = new CityDto();
            cityDto.setId(c.getId());
            cityDto.setName(c.getName());
            return cityDto;
        }).toList();

    }
}

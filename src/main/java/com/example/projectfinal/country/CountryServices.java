package com.example.projectfinal.country;

import com.example.projectfinal.travel.Travel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServices {

    private final CountryRepository countryRepository;

    public CountryServices(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<CountryDto> getCountry() {
        List<Country> allCountry = countryRepository.findAll();
        return allCountry.stream().map(c -> {
            CountryDto countryDto = new CountryDto();
            countryDto.setId(c.getId());
            countryDto.setName(c.getName());
            return countryDto;
        }).toList();
    }
}

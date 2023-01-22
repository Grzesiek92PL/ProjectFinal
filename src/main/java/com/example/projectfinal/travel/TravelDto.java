package com.example.projectfinal.travel;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class TravelDto {

    private Long id;
    private String name;

    private String description;

    private String fromCityName;
    private String toCityName;
    private String fromAirportName;
    private String toAirportName;
    private String toHotelName;
    private String countryName;
    private float tourPrice;
    private LocalDate travelDateFrom;
    private LocalDate travelDateTo;

    public TravelDto(Long id, String name, String fromCityName, String toCityName, String fromAirportName, String toAirportName, String toHotelName, String countryName, float tourPrice, LocalDate travelDateFrom, LocalDate travelDateTo) {
        this.id = id;
        this.name = name;
        this.fromCityName = fromCityName;
        this.toCityName = toCityName;
        this.fromAirportName = fromAirportName;
        this.toAirportName = toAirportName;
        this.toHotelName = toHotelName;
        this.countryName = countryName;
        this.tourPrice = tourPrice;
        this.travelDateFrom = travelDateFrom;
        this.travelDateTo = travelDateTo;
    }
}


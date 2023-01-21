package com.example.projectfinal.travel;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class TravelDto {

    private Long id;
    private String name;
    private Long fromCityId;

    private String fromCityName;
    private Long toCityId;
    private Long fromAirportId;
    private Long toAirportId;
    private Long toHotelId;
    private Long countryId;
    private float tourPrice;
    private LocalDate travelDateFrom;
    private LocalDate travelDateTo;

    public TravelDto(Long id, String name, Long fromCityId, String fromCityName, Long toCityId, Long fromAirportId, Long toAirportId, Long toHotelId, Long countryId, float tourPrice, LocalDate travelDateFrom, LocalDate travelDateTo) {
        this.id = id;
        this.name = name;
        this.fromCityId = fromCityId;
        this.fromCityName = fromCityName;
        this.toCityId = toCityId;
        this.fromAirportId = fromAirportId;
        this.toAirportId = toAirportId;
        this.toHotelId = toHotelId;
        this.countryId = countryId;
        this.tourPrice = tourPrice;
        this.travelDateFrom = travelDateFrom;
        this.travelDateTo = travelDateTo;
    }
}


package com.example.projectfinal.city;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CityDto {

    private Long id;

    public CityDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    private String name;
}

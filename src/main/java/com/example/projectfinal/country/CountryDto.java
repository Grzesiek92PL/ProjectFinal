package com.example.projectfinal.country;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CountryDto {
    private Long id;

    private String name;

    public CountryDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}

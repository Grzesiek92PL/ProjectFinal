package com.example.projectfinal.airport;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AirportDto {

    private Long id;
    private String name;

    public AirportDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}

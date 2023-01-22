package com.example.projectfinal.Hotel;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HotelDto {

    private Long id;

    private String name;

    private Long rating;

    private String description;

    public HotelDto(Long id, String name, Long rating, String description) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.description = description;
    }
}

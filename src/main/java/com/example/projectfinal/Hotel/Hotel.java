package com.example.projectfinal.Hotel;

import com.example.projectfinal.city.City;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int rating;
    private String description;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;
}

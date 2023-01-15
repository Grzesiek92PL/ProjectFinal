package com.example.projectfinal.hotels;

import com.example.projectfinal.city.City;
import jakarta.persistence.*;

@Entity
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int rating;
    private String description;

    @ManyToOne
    private City city;
}

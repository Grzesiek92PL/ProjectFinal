package com.example.projectfinal.city;

import com.example.projectfinal.Hotel.Hotel;
import com.example.projectfinal.airport.Airport;
import com.example.projectfinal.country.Country;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @OneToMany(mappedBy = "city")
    private Set<Hotel> hotels;

    @OneToMany(mappedBy = "city")
    private Set<Airport> airports;
}



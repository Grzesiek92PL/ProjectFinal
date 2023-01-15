package com.example.projectfinal.continent;

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
public class Continent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameContinent;

    @OneToMany(mappedBy = "continent") // Nazwa zmiennej po drugiej stronie relacji
    private Set<Country> countries;




}

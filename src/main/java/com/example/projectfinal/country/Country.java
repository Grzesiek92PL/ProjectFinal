package com.example.projectfinal.country;

import com.example.projectfinal.city.City;
import com.example.projectfinal.continent.Continent;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "continent_id") // nazwa kolumny z tabelki powinna być taka sama jak atrybut name
    private Continent continent;

    @OneToMany(mappedBy = "country")
    private Set<City> cities;


}

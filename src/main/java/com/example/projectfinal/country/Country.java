package com.example.projectfinal.country;

import com.example.projectfinal.continent.Continent;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    // TODO do zamapowania lista miast

}

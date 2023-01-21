package com.example.projectfinal.travel;

import com.example.projectfinal.Hotel.Hotel;
import com.example.projectfinal.airport.Airport;
import com.example.projectfinal.city.City;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Travel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "from_city_id")
    private City fromCity;

    @ManyToOne
    @JoinColumn(name = "to_city_id")
    private City toCity;

    @ManyToOne
    @JoinColumn(name = "from_airport_id")
    private Airport fromAirport;

    @ManyToOne
    @JoinColumn(name = "to_airport_id")
    private Airport toAirport;

    @ManyToOne
    @JoinColumn(name = "to_hotel_id")
    private Hotel toHotel;

    @Column(name = "travel_date_from")
    private LocalDate dateFrom;

    @Column(name = "travel_date_to")
    private LocalDate dateTo;

    @Column(name = "tour_price")
    private float tourPrice;




    /*
1. Nazwa
2. Opis
3. Skąd
4. Dokąd
5. Od kiedy
6. Do kiedy
7. Cena


Trzeba zamapować tabele Travel,
zasugeruje Wam jakie pola powinna mieć


1. Id
2. Nazwa wycieczki
3. Opis wycieczki
4. Z jakiego miasta wyjazd
5. Z jakiego lotniska wylot
6. Do jakiego kraju
7. Do jakiego miasta w kraju
8. Na jakie lotnisko przylot
9. W jakim hotelu będzie pobyt
9. Data startu wycieczki
10. Data końca wycieczki
11. Cena wycieczki za osobe
12. Ilość wolnych miejsc


Gdy już będziecie mieć te informacje to wtedy
do bazy danych wstawicie inserty i zasilicie danymi baze
   */
}

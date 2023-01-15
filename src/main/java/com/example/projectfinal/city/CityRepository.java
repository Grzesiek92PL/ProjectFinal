package com.example.projectfinal.city;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

@Controller
public interface CityRepository extends JpaRepository<City, Long> {

}

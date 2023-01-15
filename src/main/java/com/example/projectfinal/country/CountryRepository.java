package com.example.projectfinal.country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

@Controller
public interface CountryRepository extends JpaRepository<Country, Long> {

}

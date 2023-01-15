package com.example.projectfinal.continent;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

@Controller
public interface ContinentRepository extends JpaRepository<Continent, Long> {

}

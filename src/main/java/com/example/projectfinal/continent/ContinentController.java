package com.example.projectfinal.continent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class ContinentController {
    private final ContinentServices continentServices;

    public ContinentController(ContinentServices continentServices) {
        this.continentServices = continentServices;
    }

    public String continents(Model model) {


    }
}

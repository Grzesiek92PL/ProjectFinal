package com.example.projectfinal.continent;

import org.springframework.stereotype.Controller;

@Controller
public class ContinentController {
    private final ContinentServices continentServices;

    public ContinentController(ContinentServices continentServices) {
        this.continentServices = continentServices;
    }


}

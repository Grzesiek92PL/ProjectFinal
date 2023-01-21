package com.example.projectfinal.travel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TravelController {

    private final TravelServices travelServices;


    public TravelController(TravelServices travelServices) {
        this.travelServices = travelServices;
    }

    @GetMapping("/travel")
    public String getTravelList(Model model) {
        List<TravelDto> travelList = travelServices.getTravels();
        model.addAttribute("travel", travelList);
        return "travel";
    }
}

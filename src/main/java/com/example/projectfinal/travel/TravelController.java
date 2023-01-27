package com.example.projectfinal.travel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Controller
public class TravelController {

    private final TravelServices travelServices;


    public TravelController(TravelServices travelServices) {
        this.travelServices = travelServices;
    }


    @GetMapping("/travel")
    public String getTravelList(Model model) {
        List<TravelDto> travelList = travelServices.getTravels();
        model.addAttribute("travels", travelList);
        return "views/travel";
    }

    @GetMapping("/addTravel")
    public String getAddTravel(){
        return "views/addNewTravel";
    }




    @GetMapping("/travel/{id}")
    public String getTravelById(@PathVariable(value = "id") Long id, Model model) {
        Optional<Travel> travel = travelServices.findTravelById(id);
        model.addAttribute("travelById", travel);
        return "views/editTravel";
    }


/*
    @GetMapping("/addTravel")
    public String getAddTravel() {
        return "views/addNewTravel";
    }

    @GetMapping("/editTravel")
    public String get(Model model) {
        model.addAttribute("name", "Grzesiek");
        return "views/editTravel";
    }*/
}




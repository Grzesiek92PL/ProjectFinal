package com.example.projectfinal.travel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

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
        model.addAttribute("travels", travelList);
        return "travel";
    }

    @PostMapping("/addTravel")
    public RedirectView postAddTravel(Travel travel){
        travelServices.addTravel(travel);
        return new RedirectView("/travels");
    }




}

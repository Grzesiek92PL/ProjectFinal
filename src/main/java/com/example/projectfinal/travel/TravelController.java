package com.example.projectfinal.travel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TravelController {

    private final TravelService travelService;


    public TravelController(TravelService travelService) {
        this.travelService = travelService;
    }


    @GetMapping("/travel")
    public String getTravelList(Model model) {
        List<TravelDto> travelList = travelService.getTravels();
        model.addAttribute("travels", travelList);
        return "views/travel";
    }


    @GetMapping("/travel/{id}")
    public String getTravelById(@PathVariable(value = "id") Long id, Model model) {
        TravelDto travel = travelService.findTravelById(id);
        model.addAttribute("travelById", travel);
        return "views/editTravel";
    }

    @PostMapping("/editTravel")
    public String editTravel(@ModelAttribute TravelDto dto) {
        travelService.editTravel(dto);
        return "redirect:/travel";
    }
}







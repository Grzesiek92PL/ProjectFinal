package com.example.projectfinal.contact;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class contactController {

    @GetMapping("/contact")
    public String getContact() {
        return "views/contact";
    }
}

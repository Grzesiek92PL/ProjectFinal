package com.example.projectfinal.contact;

import org.springframework.web.bind.annotation.GetMapping;

public class contactController {

    @GetMapping("/contact")
    public String getContact() {
        return "views/contact";
    }
}

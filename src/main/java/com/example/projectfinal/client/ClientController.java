package com.example.projectfinal.client;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class ClientController {

    private final ClientServices clientServices;

    public ClientController(ClientServices clientServices) {
        this.clientServices = clientServices;
    }

    public String clients(Model model) {


    }
}

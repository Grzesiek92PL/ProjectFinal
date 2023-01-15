package com.example.projectfinal.client;

import org.springframework.stereotype.Service;

@Service
public class ClientServices {
    private final ClientServices clientServices;

    public ClientServices(ClientServices clientServices) {
        this.clientServices = clientServices;
    }
}

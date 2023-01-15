package com.example.projectfinal.client;

import org.springframework.stereotype.Controller;

import org.springframework.data.jpa.repository.JpaRepository;

@Controller

public interface ClientRepository extends JpaRepository<Client, Long> {

}


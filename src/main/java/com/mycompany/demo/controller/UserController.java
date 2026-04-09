/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mycompany.demo.service.UserService;


/**
 *
 * @author Krunoslav
 */
@RestController
@RequestMapping("/users")
public class UserController {
    
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Radi";
    }

    @PostMapping("/")
    public String pozdrav() {
        return "Čestitam! Moja prva Spring Boot stranica radi!";
    }
}

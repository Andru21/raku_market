package com.raku.market.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Anotación para indicar controlador @RestController
//Anotación para indicar ruta @RequestMapping
@RestController
@RequestMapping("/greet")
public class HelloWorldController {

//Anotación para peticiones get @GetMapping
    @GetMapping("/hello")
    public String hello(){
        return "Never Stop Learning!";
    }
}

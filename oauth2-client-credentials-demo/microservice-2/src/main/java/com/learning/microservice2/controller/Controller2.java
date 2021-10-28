package com.learning.microservice2.controller;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller2 {

    @GetMapping("/microservice2/home")
    @ResponseStatus(HttpStatus.OK)
    public String helloRestTemplate(){
        return "Hello";
    }

}
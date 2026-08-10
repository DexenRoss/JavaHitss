package com.dexenross.springboot_course.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dexenross.springboot_course.model.User;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hola Spring Boot";
    }

    @GetMapping("/saludo")
    public String saludo(){
        return "Bienvenido al curso de Spring Boot";
    }

    @GetMapping("/usuario")
    public User usuario(){
        return new User(
            "Emilio",
            "Java Developer"
        );
    }

}

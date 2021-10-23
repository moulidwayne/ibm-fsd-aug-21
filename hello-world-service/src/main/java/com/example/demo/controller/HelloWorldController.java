package com.example.demo.controller;

import com.example.demo.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public Person displayPerson()
    {
        return Person.builder().id(new Random().nextInt(1000)).firstName("John")
                .lastName("Doe")
                .email("john@email.com").build();
    }
}

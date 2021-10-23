package com.example.demo.controller;

import com.example.demo.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class HelloWorldController {
    private Map<Integer,Person> personMap;

    public HelloWorldController() {
      personMap=new HashMap<>();
    }

    @PostMapping("/persons")
   public Person createPerson(@RequestBody Person person)
   {
       person.setId(new Random().nextInt(1000));
       personMap.put(new Random().nextInt(),new Person(person.getId(),person.getFirstName(),person.getLastName(),person.getEmail()));
      System.out.println(personMap);
       return person;
   }

    @GetMapping("/persons")
    public Collection<Person> displayAllPerson()
    {
        return personMap.values();
    }
}

package com.acme.application;

import com.acme.Person;
import com.acme.PersonService;

import java.util.Optional;

public class PersonController {
    private PersonService personService;

    public PersonController(PersonService personService){
        this.personService = personService;
    }

    public Optional<Person> findByName(String name){
        return personService.findAll().stream().filter(p -> {
            return name.equals(p.getFirstName()) || name.equals(p.getLastName());
        }).findFirst();
    }




}

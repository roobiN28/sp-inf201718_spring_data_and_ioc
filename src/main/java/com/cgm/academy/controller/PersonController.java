package com.cgm.academy.controller;

import com.cgm.academy.model.Person;
import com.cgm.academy.service.PersonService;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class PersonController {

    private PersonService personService;
    private Integer value = 0;

    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    public PersonController(Integer value) {
        System.out.println("Inicjalizacja PersonController");
        this.value=value;
        System.out.println("Wstrzyknieta wartosc value = " + this.value);
    }

    public List<Person> getAllPerson() {
        return personService.getAllPerson();
    }
} 
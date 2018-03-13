package com.cgm.academy.person.controller;

import com.cgm.academy.person.domain.Person;
import com.cgm.academy.person.service.PersonService;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class PersonController {

    private PersonService personService;
    // wstrzykiwanie przez konstruktor
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public void savePerson(Person person){
        this.personService.save(person);
    }

    public List<Person> getAllPerson() {
        return personService.getAllPerson();
    }
} 
package com.cgm.academy.person.controller;

import com.cgm.academy.person.domain.Person;
import com.cgm.academy.person.service.PersonService;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class PersonController {

    private PersonService personService;
    private Integer value = 0;

    // wstrzykiwanie przez setter
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    // wstrzykiwanie przez konstruktor
    public PersonController(Integer value) {
        System.out.println("Inicjalizacja PersonController");
        this.value=value;
        System.out.println("Wstrzyknieta wartosc value = " + this.value);
    }

    public void savePerson(Person person){
        this.personService.save(person);
    }

    public List<Person> getAllPerson() {
        return personService.getAllPerson();
    }
} 
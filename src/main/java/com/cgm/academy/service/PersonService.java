package com.cgm.academy.service;

import com.cgm.academy.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    public List<Person> getAllPerson() {
        List<Person> list = new ArrayList<>();
        list.add(new Person(1, "Joe", "Doe"));
        list.add(new Person(2, "John", "Smith"));
        list.add(new Person(3, "Jane", "Public"));
        return list;
    }
}

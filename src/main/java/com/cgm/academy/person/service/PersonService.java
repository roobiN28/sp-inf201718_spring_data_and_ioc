package com.cgm.academy.person.service;

import com.cgm.academy.address.domain.AddressType;
import com.cgm.academy.person.domain.Person;
import com.cgm.academy.person.repository.PersonRepository;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;

import java.util.List;


@Slf4j
public class PersonService {
    private PersonRepository personRepository;
    // wstrzykiwanie przez setter
    public void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAllPerson() {
        // Lists pochodzi z biblioteki Google Guava - całkiem przydatne narzędzie :)
        return Lists.newArrayList(personRepository.findAll());
    }

     public List<Person> findPersonWithoutActiveAddress(AddressType addressType){
        // TODO: implement :)
         return null;
     }

    public void save(Person person) {
        log.info("Saving person: {}", person);
        personRepository.save(person);
    }

}

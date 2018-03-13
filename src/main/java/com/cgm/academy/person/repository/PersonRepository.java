package com.cgm.academy.person.repository;

import com.cgm.academy.person.domain.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository  extends CrudRepository<Person, Long> {

}

package com.cgm.academy;

import com.cgm.academy.controller.PersonController;
import com.cgm.academy.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.util.List;

@SpringBootApplication
@ImportResource("classpath:app-config.xml")
public class MyApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

    @Autowired
    private PersonController personController;

    @Override
    public void run(String... strings) {
        List<Person> allPerson = personController.getAllPerson();
        allPerson.forEach(System.out::println);
    }
}
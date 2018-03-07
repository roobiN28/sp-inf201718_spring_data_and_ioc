package com.cgm.academy.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Person {
    private int id;
    private String firstName;
    private String lastName;
} 
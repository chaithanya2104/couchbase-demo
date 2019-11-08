package com.example.couchbasedemo.service;

import com.example.couchbasedemo.model.Person;

import java.util.List;

public interface PersonService {

    Person findOne(String id);

    List<Person> findAll();

    List<Person> findByFirstName(String firstName);

    Person create(Person person);

    void update(Person person);

    void delete(Person person);

}

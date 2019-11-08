package com.example.couchbasedemo.repository;

import com.example.couchbasedemo.model.Person;
import org.springframework.data.couchbase.core.query.View;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, String> {

    @View
    List<Person> findByFirstName(String firstName);

}

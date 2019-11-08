package com.example.couchbasedemo.controller;

import com.example.couchbasedemo.model.Person;
import com.example.couchbasedemo.service.PersonRepositoryService;
import com.example.couchbasedemo.service.PersonTemplateService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DocumentController {

    private PersonRepositoryService personRepositoryService;
    private PersonTemplateService personTemplateService;

    public DocumentController(PersonRepositoryService personRepositoryService, PersonTemplateService personTemplateService) {
        this.personRepositoryService = personRepositoryService;
        this.personTemplateService = personTemplateService;
    }

    @GetMapping(value = "hello", produces = "application/json")
    public String greeting() {
        return "Hello!";
    }

    @GetMapping(value = "getAllPersons", produces = "application/json")
    public List<Person> getAllPersons() {
        return personTemplateService.findAll();
    }

    @GetMapping(value = "getPersonById/{id}", produces = "application/json")
    public Person getPersonById(@PathVariable String id) {
        return personTemplateService.findOne(id);
    }

    @PostMapping(value = "createPerson", produces = "application/json")
    public void createPerson(@RequestBody Person person) {
        personRepositoryService.create(person);
    }


}

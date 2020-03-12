package com.halehan.demo.rest.service.mongo.ct;


import com.halehan.demo.rest.model.mongo.ct.Person;

public interface PersonService {
    public Iterable<Person> findByLastName(String lastName);
    public Iterable<Person> findAll();
}

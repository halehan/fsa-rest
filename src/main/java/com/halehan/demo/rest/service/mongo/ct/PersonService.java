package com.halehan.demo.rest.service.mongo.ct;


import com.halehan.demo.rest.model.mongo.ct.Person;
import com.halehan.demo.rest.model.mongo.ct.PersonDto;
import org.bson.types.ObjectId;

public interface PersonService {
    public Iterable<Person> findByLastName(String lastName);
    public Iterable<Person> findAll();
    public PersonDto findById(ObjectId id);
    public String deletePerson(ObjectId id);
}

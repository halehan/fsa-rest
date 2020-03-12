package com.halehan.demo.rest.service.mongo.ct;

import com.halehan.demo.rest.model.Patient;
import com.halehan.demo.rest.model.PatientCrudRepository;
import com.halehan.demo.rest.model.mongo.ct.Person;
import com.halehan.demo.rest.model.mongo.ct.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonRepository personRepository;

    public Iterable<Person> findByLastName(String lastName) {
        return personRepository.findByLastName(lastName);
    }

    public  Iterable<Person>  findAll() {
        Iterable<Person> persons = null;

        try {persons = personRepository.findAll();}
        catch (Exception e) { }

        return persons;
    }
}

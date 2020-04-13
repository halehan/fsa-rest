package com.halehan.demo.rest.service.mongo.ct;

import com.halehan.demo.rest.model.AppModelMapper;
import com.halehan.demo.rest.model.Patient;
import com.halehan.demo.rest.model.PatientCrudRepository;
import com.halehan.demo.rest.model.mongo.ct.Person;
import com.halehan.demo.rest.model.mongo.ct.PersonDto;
import com.halehan.demo.rest.model.mongo.ct.PersonRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonRepository personRepository;
    @Autowired
    AppModelMapper dtoMapper;

    public PersonDto findById(ObjectId id) {
       return  dtoMapper.mapPersonDto(personRepository.findBy_id(id));
    }

    public Iterable<Person> findByLastName(String lastName) {
        return personRepository.findByLastName(lastName);
    }

    public  Iterable<Person>  findAll() {
        Iterable<Person> persons = null;

        try {persons = personRepository.findAll();}
        catch (Exception e) {
            e.printStackTrace();
        }

        return persons;
    }

    @Override
    public String deletePerson(ObjectId id) {
        String rtn = "success";

        try {
            Person p = personRepository.findBy_id(id);
            personRepository.delete(p);
        } catch (Exception e ) {
            rtn = "failed";

        }

        return rtn;
    }
}

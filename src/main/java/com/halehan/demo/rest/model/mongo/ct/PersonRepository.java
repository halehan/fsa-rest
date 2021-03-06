package com.halehan.demo.rest.model.mongo.ct;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

public interface PersonRepository extends MongoRepository<Person, String> {

    List<Person> findByLastName(@Param("lastName") String name);
    Person findBy_id(ObjectId _id);
}
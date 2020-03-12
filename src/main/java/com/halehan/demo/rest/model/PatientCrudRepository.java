package com.halehan.demo.rest.model;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientCrudRepository extends PagingAndSortingRepository<Patient, Integer> {

    List<Patient> findByLastname(@Param("lastname") String name);

}
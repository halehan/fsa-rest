package com.halehan.demo.rest.model;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProcedureRepository extends PagingAndSortingRepository<Procedure, Integer> {

    List<Patient> findByName(@Param("name") String name);
}

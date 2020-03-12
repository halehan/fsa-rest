package com.halehan.demo.rest.service;

import com.halehan.demo.rest.model.Patient;

public interface ProcedureService {

    public  Iterable<Patient>   getAllPatients();

    public Iterable<Patient> findName(String lastName);

}

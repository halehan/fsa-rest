package com.halehan.demo.rest.service;

import com.halehan.demo.rest.model.Patient;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PatientService {

    public  Iterable<Patient>   getAllPatients();

    public String addPatient(Patient patient);

   public String updatePatient(Patient patient, int id);

   public String deletePatient(int id);

   public Iterable<Patient> findByLastName(String lastName);

   // public Patient getPatient(int id);
}

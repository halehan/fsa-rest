package com.halehan.demo.rest.service;

import com.halehan.demo.rest.model.Patient;
import com.halehan.demo.rest.model.PatientDTO;

import java.util.List;
import java.util.Optional;


public interface PatientService {

    public List<PatientDTO> getAllPatients();

    public String addPatient(PatientDTO patient);

   public String updatePatient(PatientDTO patient, int id);

   public String deletePatient(int id);

   public List<PatientDTO> findByLastName(String lastName);

   // public Patient getPatient(int id);
}

package com.halehan.demo.rest.model;


import org.springframework.stereotype.Component;

@Component
public class DtoMapper {

    public PatientDTO mapPatientDto(Patient patient) {

        PatientDTO dto = new PatientDTO();
        dto.setId(patient.getId());
        dto.setEmail(patient.getEmail());
        dto.setFirstName(patient.getFirstname());
        dto.setLastName(patient.getLastname());
        dto.setStatus(patient.getStatus());
        dto.setStudyEye(patient.getStudyeye());
        dto.setStudyId(patient.getStudyid());
        return dto;

    }
}

package com.halehan.demo.rest.model;


import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class DaoService {

    @Autowired
    private EntityManager entityManager;

    @Autowired
    AppModelMapper dtoMapper;

    @Transactional(propagation = Propagation.NOT_SUPPORTED )
    public PatientDTO findPatientById(int id) {

        Patient p =  this.entityManager.find(Patient.class, id);
        return dtoMapper.mapPatientDto(p);

    }


}

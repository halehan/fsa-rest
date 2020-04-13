package com.halehan.demo.rest.service;

import com.halehan.demo.rest.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcedureServiceImpl {
    @Autowired
    AppModelMapper dtoMapper;

    @Autowired
    ProcedureRepository procedureRepository;

    public  Iterable<Procedure>  getAllProcedures() {
        Iterable<Procedure> procedures = null;

        try {procedures = procedureRepository.findAll();}
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return procedures;
    }
}

package com.halehan.demo.rest.model;

import com.halehan.demo.rest.model.mongo.ct.Person;
import com.halehan.demo.rest.model.mongo.ct.PersonDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AppModelMapper extends ModelMapper {

    public PatientDTO mapPatientDto (Patient p) {
        return map(p, PatientDTO.class);
    }

    public PersonDto mapPersonDto (Person p) {
        return map(p, PersonDto.class);
    }

}

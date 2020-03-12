package com.halehan.demo.rest.controller.mongo.ct;

import com.halehan.demo.rest.model.Procedure;
import com.halehan.demo.rest.model.mongo.ct.Person;
import com.halehan.demo.rest.service.ProcedureServiceImpl;
import com.halehan.demo.rest.service.mongo.ct.PersonServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping(path="/procedure") // This means URL's start with /demo (after Application path)
public class ProcedureController {

    Logger logger = LoggerFactory.getLogger(ProcedureController.class);

    @Autowired
    // This means to get the bean called patientService
    // Which is auto-generated by Spring, we will use it to handle the data
    private ProcedureServiceImpl procedureService;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Procedure> getAllUsers() {
        logger.info("Testing");
        return  procedureService.getAllProcedures();
    }
}
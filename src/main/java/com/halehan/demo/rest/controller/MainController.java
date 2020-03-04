package com.halehan.demo.rest.controller;

        import com.halehan.demo.rest.model.Patient;
        import com.halehan.demo.rest.model.PatientRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.*;

@Controller // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private PatientRepository patientRepository;

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody int addNewUser (@RequestBody Patient newPatient) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Patient p = new Patient();
        p.setStudyid(newPatient.getStudyid());
        p.setFirstname(newPatient.getFirstname());
        p.setLastName(newPatient.getLastname());
        p.setEmail(newPatient.getEmail());
       patientRepository.save(p);
        return p.getId();
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Patient> getAllUsers() {
        // This returns a JSON or XML with the users
        return patientRepository.findAll();
    }
}


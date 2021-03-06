package com.halehan.demo.rest.controller;

        import com.halehan.demo.rest.model.DaoService;
        import com.halehan.demo.rest.model.Patient;
        import com.halehan.demo.rest.model.PatientDTO;
        import com.halehan.demo.rest.service.PatientServiceImpl;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;
        import java.util.Optional;

@Controller // This means that this class is a Controller
@RequestMapping(path="/patient") // This means URL's start with /demo (after Application path)
public class MainController {

    @Autowired
    // This means to get the bean called patientService
    // Which is auto-generated by Spring, we will use it to handle the data
    private PatientServiceImpl patientService;

    @Autowired
    DaoService daoService;

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewUser (@RequestBody PatientDTO newPatient) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestBody means it is in the body from the POST request
        return patientService.addPatient(newPatient);
    }

    @GetMapping(path="/all")
    public @ResponseBody
    List<PatientDTO> getAllUsers() {
       return  patientService.getAllPatients();
    }

    @GetMapping(path="/lastName/{lastName}")
    public @ResponseBody
    List<PatientDTO> getByLastName(@PathVariable String lastName) {
        return  patientService.findByLastName(lastName);
    }

    @GetMapping("/{id}")
    public @ResponseBody
    PatientDTO getById(@PathVariable int id) {
        return  daoService.findPatientById(id);
    }

    @DeleteMapping("/{id}")
    public @ResponseBody String deleteStudent(@PathVariable int id) {
        return patientService.deletePatient(id);
    }

    @PutMapping("/{id}")
    public @ResponseBody String updateStudent(@RequestBody PatientDTO p, @PathVariable long id) {
        return patientService.updatePatient(p, Math.toIntExact(id));
    }

}
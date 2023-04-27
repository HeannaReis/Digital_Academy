package dio.digitalAcademy.controller;

import dio.digitalAcademy.entity.Registration;
import dio.digitalAcademy.entity.form.RegistrationForm;
import dio.digitalAcademy.service.impl.RegistrationServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registrations")
public class RegistrationController {
    @Autowired
    private RegistrationServiceImpl service;

    @PostMapping
    public Registration create(@Valid @RequestBody RegistrationForm form){
        return service.create(form);
    }
    @GetMapping
    public List<Registration> getAll(@RequestParam(value = "city", required = false) String city) {
        return service.getAll(city);
    }
}

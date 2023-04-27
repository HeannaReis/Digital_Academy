package dio.digitalAcademy.controller;

import dio.digitalAcademy.entity.Students;
import dio.digitalAcademy.entity.WellnessAssessment;
import dio.digitalAcademy.entity.form.StudentsForm;
import dio.digitalAcademy.service.impl.StudentsServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentsController {
    @Autowired
    private StudentsServiceImpl service;

    @PostMapping
    public Students create(@Valid @RequestBody StudentsForm form){
        return service.create(form);
    }
    @GetMapping("/assessment/{id}")
    public List<WellnessAssessment> getAllWellnessAssessmentId(@PathVariable Long id) {
        return service.getAllWellnessAssessmentId(id);
    }
    @GetMapping
    public List<Students> getAll(@RequestParam(value = "birth", required = false)
                                     String birth){
        return service.getAll(birth);
    }

}

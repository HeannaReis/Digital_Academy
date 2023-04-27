package dio.digitalAcademy.controller;

import dio.digitalAcademy.entity.WellnessAssessment;
import dio.digitalAcademy.entity.form.WellnessAssessmentForm;
import dio.digitalAcademy.service.impl.WellnessAssessmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assessment")
public class AssessmentController {
    @Autowired
    private WellnessAssessmentServiceImpl service;

    @PostMapping
    public WellnessAssessment create(@RequestBody WellnessAssessmentForm form){
        return service.create(form);
    }
    @GetMapping
    public List<WellnessAssessment>getAll(){
        return service.getAll();
    }
}

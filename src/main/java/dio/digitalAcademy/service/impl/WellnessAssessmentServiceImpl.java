package dio.digitalAcademy.service.impl;

import dio.digitalAcademy.entity.Students;
import dio.digitalAcademy.entity.WellnessAssessment;
import dio.digitalAcademy.entity.form.WellnessAssessmentForm;
import dio.digitalAcademy.entity.form.WellnessAssessmentUpdateForm;
import dio.digitalAcademy.repository.StudentsRepository;
import dio.digitalAcademy.repository.WellnessAssessmentRepository;
import dio.digitalAcademy.service.IWellnessAssessmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WellnessAssessmentServiceImpl implements IWellnessAssessmentService {
    @Autowired
    private WellnessAssessmentRepository wellnessAssessmentRepository;
    @Autowired
    private StudentsRepository studentsRepository;

    @Override
    public WellnessAssessment create(WellnessAssessmentForm form) {
        WellnessAssessment wellnessAssessment = new WellnessAssessment();
        Students students = studentsRepository.findById(form.getStudents_id()).get();
        wellnessAssessment.setStudent(students);
        wellnessAssessment.setWeight(form.getWeigth());
        wellnessAssessment.setHeight(form.getHeigth());
        return wellnessAssessmentRepository.save(wellnessAssessment);
    }

    @Override
    public WellnessAssessment get(Long id) {

        return null;
    }

    @Override
    public List<WellnessAssessment> getAll() {
        return wellnessAssessmentRepository.findAll();
    }

    @Override
    public WellnessAssessment update(Long id, WellnessAssessmentUpdateForm formUpdate) {

        return null;
    }

    @Override
    public void delete(Long id) {

    }
}

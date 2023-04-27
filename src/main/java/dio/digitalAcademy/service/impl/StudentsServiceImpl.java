package dio.digitalAcademy.service.impl;

import dio.digitalAcademy.entity.Students;
import dio.digitalAcademy.entity.WellnessAssessment;
import dio.digitalAcademy.entity.form.StudentsForm;
import dio.digitalAcademy.entity.form.StudentsUpdateForm;
import dio.digitalAcademy.repository.StudentsRepository;
import dio.digitalAcademy.service.IStudentsService;
import dio.digitalAcademy.service.impl.validation.CpfAlreadyExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class StudentsServiceImpl implements IStudentsService {
    @Autowired
    private StudentsRepository repository;

    @Override
    public Students create(StudentsForm form) {
        Optional<Students> existingStudent = repository.findByCpf(form.getCpf());
        if (existingStudent.isPresent()) {
            throw new CpfAlreadyExistsException("CPF already exists." + form.getCpf());
        }

        Students students = new Students();
        students.setName(form.getName());
        students.setCpf(form.getCpf());
        students.setCity(form.getCity());
        students.setBirth(form.getBirth());

        return repository.save(students);
    }
    @Override
    public Students get(Long id) {
        return null;
    }
    @Override
    public List<Students> getAll(String birth) {
        if(birth == null) {
            return repository.findAll();
        } else {
            LocalDate localDate = LocalDate.parse(birth, me.dio.academia.digital.infra.utils.JavaTimeUtils.LOCAL_DATE_FORMATTER);
            return repository.findByBirth(localDate);
        }
    }
    @Override
    public Students update(Long id, StudentsUpdateForm formUpdate) {

        return null;
    }
    @Override
    public void delete(Long id) {
    }
    @Override
    public List<WellnessAssessment> getAllWellnessAssessmentId(Long id) {
        Students students = repository.findById(id).get();
        return students.getAssessments();
    }
}

package dio.digitalAcademy.service.impl;

import dio.digitalAcademy.entity.Registration;
import dio.digitalAcademy.entity.Students;
import dio.digitalAcademy.entity.form.RegistrationForm;
import dio.digitalAcademy.repository.RegistrationRepository;
import dio.digitalAcademy.repository.StudentsRepository;
import dio.digitalAcademy.service.IRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationServiceImpl implements IRegistrationService {
    @Autowired
    private RegistrationRepository registrationRepository;
    @Autowired
    private StudentsRepository studentsRepository;

    @Override
    public Registration create(RegistrationForm form) {
        Registration registration = new Registration();
        Students students = studentsRepository.findById(form.getStudent_id()).get();
        registration.setStudent(students);
        return registrationRepository.save(registration);

    }

    @Override
    public Registration get(Long id) {
        return registrationRepository.findById(id).get();
    }

    @Override
    public List<Registration> getAll(String city) {
        if(city == null){
            return registrationRepository.findAll();
        }else{
            return registrationRepository.findStudentRegistrationCity(city);
        }
    }

    @Override
    public void delete(Long id) {

    }
}

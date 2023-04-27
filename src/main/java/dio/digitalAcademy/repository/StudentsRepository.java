package dio.digitalAcademy.repository;

import dio.digitalAcademy.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Long> {

    /**
     *
     * @param birth: students' date of birth
     * @return List with all students with the date of birth passed as the function parameter
     */
    List<Students> findByBirth(LocalDate birth);
    Optional<Students> findByCpf(String cpf);

}

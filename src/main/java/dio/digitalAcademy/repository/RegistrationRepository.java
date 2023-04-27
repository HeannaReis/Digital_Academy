package dio.digitalAcademy.repository;

import dio.digitalAcademy.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {
    /**
     *
     * @param city cidade referência para o filtro
     * @return List of registered students living in the past city as a parameter
     */
    @Query(value = "SELECT * FROM registration r " +
            "INNER JOIN students s ON r.student_id = s.id " +
            "WHERE s.city = :city", nativeQuery = true)
    //@Query("FROM Registration r WHERE s.student.city = :city ")
    List<Registration> findStudentRegistrationCity(String city);

    //List<Registration> findByStudentCity(String city);
}

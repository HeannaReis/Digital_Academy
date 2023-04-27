package dio.digitalAcademy.repository;

import dio.digitalAcademy.entity.WellnessAssessment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WellnessAssessmentRepository extends JpaRepository<WellnessAssessment, Long> {
}

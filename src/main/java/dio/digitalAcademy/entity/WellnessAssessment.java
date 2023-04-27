package dio.digitalAcademy.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "wellness_assessment")
public class WellnessAssessment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private Students student;

    @Column(name = "weight")
    private double weight;

    @Column(name = "height")
    private double height;

    @Column(name = "assessment_date")
    private LocalDateTime assessmentDate = LocalDateTime.now();

}

package dio.digitalAcademy.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WellnessAssessmentForm {
    //@Positive(message = "Student Id needs to be positive.")
    private Long students_id;

    //@NotNull(message = "Fill in the field correctly.")
    //@Positive(message = "${validatedValue}' needs to be positive.")
    private double weigth;

    //@NotNull(message = "Fill in the field correctly.")
    //@Positive(message = "${validatedValue}' needs to be positive.")
    //@DecimalMin(value = "150", message = "'${validatedValue}' needs to be at least {value}.")
    private double heigth;
}

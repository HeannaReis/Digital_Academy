package dio.digitalAcademy.entity.form;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class RegistrationForm {

        @NotNull(message = "Fill in the field correctly.")
        @Positive(message = "Student Id needs positive.")
        private Long student_id;
}

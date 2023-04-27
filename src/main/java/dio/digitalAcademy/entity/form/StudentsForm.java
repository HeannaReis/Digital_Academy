package dio.digitalAcademy.entity.form;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentsForm {
    @NotEmpty(message = "Fill in the fields correctly.")
    @Size(min = 3, max =50, message = "'${validatedValue}' This field must have between {min} and {max} characters.")
    private String name;

    @NotEmpty(message = "Fill in the fields correctly.")
    //@CPF(message = "'${validatedValue}' is invalid!")
    private String cpf;

    @NotEmpty(message = "Fill in the fields correctly.")
    @Size(min = 3, max =50, message = "'${validatedValue}' This field must have between {min} and {max} characters.")
    private String city;

    @NotNull(message = "Fill in the fields correctly.")
    @Past(message = "Date '${validatedValue}' is invalid.")
    private LocalDate birth;
}

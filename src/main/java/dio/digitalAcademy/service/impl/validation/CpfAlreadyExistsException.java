package dio.digitalAcademy.service.impl.validation;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class CpfAlreadyExistsException extends RuntimeException{
    public CpfAlreadyExistsException(String message) {
        super(message);
    }
}

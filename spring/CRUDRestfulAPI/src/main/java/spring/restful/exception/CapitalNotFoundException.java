package spring.restful.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Capital not found")
public class CapitalNotFoundException extends RuntimeException {

    public CapitalNotFoundException(int id) {
    }
}

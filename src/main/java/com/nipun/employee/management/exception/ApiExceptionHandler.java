package com.nipun.employee.management.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

/**
 * @author Nipun on 23/5/22
 */
@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity employeeNotFoundExceptionHandler(EmployeeNotFoundException exception,
                                                           WebRequest request) {

        HttpStatus notFound = HttpStatus.NOT_FOUND;
        return ResponseEntity.status(notFound)
                .body(new ApiException(notFound, exception.getMessage()));
    }
}

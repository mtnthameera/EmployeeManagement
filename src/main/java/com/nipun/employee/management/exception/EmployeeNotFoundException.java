package com.nipun.employee.management.exception;

import java.util.function.Supplier;

/**
 * @author Nipun on 23/5/22
 */

public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(String message) {
        super(message);
    }

    public EmployeeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

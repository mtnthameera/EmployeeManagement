package com.nipun.employee.management.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * @author Nipun on 23/5/22
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {

    private HttpStatus status;
    private String message;

}

package com.nipun.employee.management.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

/**
 * @author Nipun on 25/5/22
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDTO {

 //private Long employeeId;
 private String firstName;
 private String lastName;
 private String emailId;
 private String designation;

}

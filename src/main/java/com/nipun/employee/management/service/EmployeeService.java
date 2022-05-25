package com.nipun.employee.management.service;

import com.nipun.employee.management.exception.ApiResponse;
import com.nipun.employee.management.model.Employee;
import com.nipun.employee.management.model.EmployeeDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * @author Nipun on 23/5/22
 */

public interface EmployeeService {

    List<EmployeeDTO> getEmployees();

    ResponseEntity<ApiResponse> addEmployee(Employee employee);

    EmployeeDTO getEmployeeById(Long empId);

    ResponseEntity<ApiResponse> removeEmployee(Long empId);

    ResponseEntity<ApiResponse> updateEmployee(Long id, Employee employee);
}

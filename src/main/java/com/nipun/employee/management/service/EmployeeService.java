package com.nipun.employee.management.service;

import com.nipun.employee.management.exception.ApiResponse;
import com.nipun.employee.management.model.Employee;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * @author Nipun on 23/5/22
 */

public interface EmployeeService {

    List<Employee> getEmployees();

    Employee addEmployee(Employee employee);

    Employee getEmployeeById(Long empId);

    ResponseEntity<ApiResponse> removeEmployee(Long empId);

    ResponseEntity<ApiResponse> updateEmployee(Long id, Employee employee);
}

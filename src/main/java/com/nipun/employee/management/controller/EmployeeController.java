package com.nipun.employee.management.controller;

import com.nipun.employee.management.exception.ApiResponse;
import com.nipun.employee.management.model.Employee;
import com.nipun.employee.management.model.EmployeeDTO;
import com.nipun.employee.management.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Nipun on 23/5/22
 */

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public List<EmployeeDTO> getEmployees() {
        return employeeService.getEmployees();
    }

    @PostMapping("/employees")
    public ResponseEntity<ApiResponse> addEmployee(@RequestBody Employee emp) {
        return employeeService.addEmployee(emp);
    }

    @GetMapping("/employees/{empId}")
    public EmployeeDTO getEmployeeById(@PathVariable Long empId) {
        return employeeService.getEmployeeById(empId);
    }

    @DeleteMapping("/employees/{empId}")
    public ResponseEntity<ApiResponse> removeEmployee(@PathVariable Long empId) {
        return employeeService.removeEmployee(empId);
    }

    @PutMapping("employees/{empId}")
    public ResponseEntity<ApiResponse> updateEmployee(@PathVariable Long empId, @RequestBody Employee emp) {
        return employeeService.updateEmployee(empId, emp);
    }
}

package com.nipun.employee.management.service;

import com.nipun.employee.management.exception.ApiResponse;
import com.nipun.employee.management.exception.EmployeeNotFoundException;
import com.nipun.employee.management.model.Employee;
import com.nipun.employee.management.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author Nipun on 23/5/22
 */

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    @Autowired
    EmployeeRepository repository;

    @Override
    public List<Employee> getEmployees() {
        LOGGER.info("Fetching Employee List");
        return repository.findAll();
    }

    @Override
    public Employee addEmployee(Employee employee) {
        LOGGER.info("Saving Employee");
        return repository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long empId) {
        LOGGER.info("Fetching Employee. empId {}", empId);
        Optional<Employee> employeeOptional = repository.findByEmployeeId(empId);
        if(!employeeOptional.isPresent()){
            throw new EmployeeNotFoundException("Invalid Employee ID.");
        }
        return employeeOptional.get();
    }

    @Override
    public ResponseEntity<ApiResponse> removeEmployee(Long empId) {
        LOGGER.info("Removing Employee. empId {}", empId);
        Optional<Employee> employeeOptional = repository.findByEmployeeId(empId);
        if(!employeeOptional.isPresent()){
            LOGGER.info("Employee {} Not found", empId);
            throw new EmployeeNotFoundException("Invalid Employee ID.");
        }
        repository.deleteById(empId);
        LOGGER.info("Employee {} removed.", empId);
        return ResponseEntity.ok(new ApiResponse(HttpStatus.OK,
                "Employee removed."));
    }

    @Override
    public ResponseEntity<ApiResponse> updateEmployee(Long empId, Employee employee) {
        LOGGER.info("Updating Employee. empId {}", empId);
        Optional<Employee> employeeOptional = repository.findByEmployeeId(empId);
        if(!employeeOptional.isPresent()){
            LOGGER.info("Employee {} Not found", empId);
            throw new EmployeeNotFoundException("Invalid Employee ID.");
        }
        repository.save(employee);
        LOGGER.info("Employee {} details updated.", empId);
        return ResponseEntity.ok(new ApiResponse(HttpStatus.OK,
                "Employee details updated."));

    }
}

package com.nipun.employee.management.DAO;

import com.nipun.employee.management.model.Employee;

import java.util.List;
import java.util.Optional;

/**
 * @author Nipun on 25/5/22
 */

public interface EmployeeDao {

    List<Employee> getAllEmployees();

    Optional<Employee> getEmployeeById(Long empId);

    void addEmployee(Employee employee);

    void removeEmployee(Long empId);

    void updateEmployee(Employee employee);
}

package com.cogn.Employee.service;


import java.util.List;

import com.cogn.Employee.entity.Employee;


public interface EmployeeService {

    Employee addEmployee(Employee employee);

    List<Employee> listEmployee();

    Employee fetchEmployeeById(Long empId);

    String deleteEmployee(Long empId);

    Employee editEmployee(Long empId, Employee employee);

}

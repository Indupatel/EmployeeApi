package com.cogn.Employee.service;

import com.cogn.Employee.entity.Employee;
import com.cogn.Employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Objects;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        // TODO Auto-generated method stub
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> listEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee fetchEmployeeById(Long empId) {
        // TODO Auto-generated method stub
        return employeeRepository.findById(empId).get();
    }

    @Override
    public String deleteEmployee(Long empId) {
        Employee e=employeeRepository.findById(empId).get();
        employeeRepository.delete(e);
        return "Employee Record Deleted";
    }

    @Override
    public Employee editEmployee(Long empId, Employee employee) {
        Employee e=employeeRepository.findById(empId).get();
        if(Objects.nonNull((employee.getEmpFirstName()))&& !"".equals(employee.getEmpFirstName())){
            e.setEmpFirstName(employee.getEmpFirstName());
        }

        if(Objects.nonNull((employee.getEmpLastName()))&& !"".equals(employee.getEmpLastName())){
            e.setEmpLastName(employee.getEmpLastName());
        }

        if(Objects.nonNull((employee.getEmpPhone()))&& !"".equals(employee.getEmpPhone())){
            e.setEmpPhone(employee.getEmpPhone());
        }

        if(Objects.nonNull((employee.getEmpLocation()))&& !"".equals(employee.getEmpLocation())){
            e.setEmpLocation(employee.getEmpLocation());
        }

        if(Objects.nonNull((employee.getEmpEmail()))&& !"".equals(employee.getEmpEmail())){
            e.setEmpEmail(employee.getEmpEmail());
        }
        return employeeRepository.save(e);
    }



}

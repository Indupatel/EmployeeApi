package com.cogn.Employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogn.Employee.entity.Employee;
import com.cogn.Employee.service.EmployeeService;


@RestController
@CrossOrigin(origins="*")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        return  employeeService.addEmployee(employee);}
    @GetMapping ("/employees")
    public List<Employee> listEmployee(){
        return  employeeService.listEmployee();
    }
    @GetMapping ("/employees/{id}")
    public Employee fetchEmployeeById(@PathVariable ("id") Long empId){
        return employeeService.fetchEmployeeById(empId);
    }
    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable ("id") Long empId){

        return  employeeService.deleteEmployee(empId);}

    @PutMapping ("/employees/{id}")
    public Employee editEmployee(@PathVariable ("id") Long empId, @RequestBody Employee employee){
        return  employeeService.editEmployee(empId,employee);
    }

}


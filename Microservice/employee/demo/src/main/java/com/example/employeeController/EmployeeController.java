package com.example.employeeController;


import com.example.employeeService.EmployeeService;
import com.example.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class EmployeeController {
    @Autowired
    public EmployeeService employeeService;

    @PostMapping("/employee")
    public Employee saveEmployeeDetails(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> allEmployees(){
        return employeeService.allEmployee();
    }
}

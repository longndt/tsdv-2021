package com.example.crud.controller;

import com.example.crud.model.Employee;
import com.example.crud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employee")
public class EmployeeAPIController {
    @Autowired
    EmployeeRepository employeeRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List displayEmployeeListAPI() {
        List<Employee> employeeList = employeeRepository.findAll();
        return employeeList;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Employee displayEmployeeAPI(
            @PathVariable("id") Long id)
    {
        Employee employee = employeeRepository.findById(id).get();
        return employee;
    }

}

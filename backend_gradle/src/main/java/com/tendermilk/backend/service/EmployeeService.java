package com.tendermilk.backend.service;

import com.tendermilk.backend.collection.Employee;
import com.tendermilk.backend.repository.EmployeeRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

   
    public String save(Employee employee) {
        return employeeRepository.save(employee).getId();
    }

    
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    
    public List<Employee> getByName(String term) {
        return employeeRepository.getByName(term);
    }
}

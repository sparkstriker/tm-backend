package com.tendermilk.backend.service;

import com.tendermilk.backend.collection.Employee;
import com.tendermilk.backend.repository.EmployeeRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public String save(Employee employee) {
        return employeeRepository.save(employee).getEmployeeId();
    }

    @Override
    public List<Employee> findAll() {
        return mongoTemplate.findAll(Employee.class);
    }

    @Override
    public List<Employee> getByName(String term) {
        return employeeRepository.getByName(term);
    }
}

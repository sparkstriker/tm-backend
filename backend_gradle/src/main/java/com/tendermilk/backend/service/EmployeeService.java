package com.tendermilk.backend.service;

import java.util.List;

import com.tendermilk.backend.collection.Employee;

public interface EmployeeService {
    String save(Employee employee);

    List<Employee> findAll();

    List<Employee> getByName(String term);
}

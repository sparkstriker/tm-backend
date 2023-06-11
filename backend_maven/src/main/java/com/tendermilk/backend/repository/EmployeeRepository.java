package com.tendermilk.backend.repository;

import com.tendermilk.backend.collection.Employee;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {

    @Query("{ $or :[ { 'firstName' : { $regex : ?0 } }, { 'lastName' : { $regex : ?0 } } ] }")
    List<Employee> getByName(String term);

}

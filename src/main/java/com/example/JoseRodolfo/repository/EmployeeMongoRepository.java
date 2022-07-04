package com.example.JoseRodolfo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.JoseRodolfo.model.Employee;

@Repository
public interface EmployeeMongoRepository extends MongoRepository<Employee, String>{
    
}

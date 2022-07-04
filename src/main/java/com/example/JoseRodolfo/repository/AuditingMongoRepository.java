package com.example.JoseRodolfo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.JoseRodolfo.model.Auditing;

@Repository
public interface AuditingMongoRepository extends MongoRepository<Auditing, String> {
    
}

package com.example.JoseRodolfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JoseRodolfo.model.Auditing;
import com.example.JoseRodolfo.repository.AuditingMongoRepository;

@Service
public class AuditingService {

    @Autowired
    private AuditingMongoRepository audRepo;

    public List<Auditing> getAllAuditing(){
        return audRepo.findAll();
    }
    
}

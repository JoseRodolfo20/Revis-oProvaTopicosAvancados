package com.example.JoseRodolfo.model;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Employees")
public class Employee {

        @org.springframework.data.annotation.Id
        private String id;
    private String cpf;
    private String name;
    private String extraWorkedHours;
    private String lastTrainingDate;
    private String payrollTotalValue;

    @DBRef(lazy = true)
    private Auditing auditing;

    public Employee(){

    }


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getExtraWorkedHours() {
        return extraWorkedHours;
    }
    public void setExtraWorkedHours(String extraWorkedHours) {
        this.extraWorkedHours = extraWorkedHours;
    }
    public String getLastTrainingDate() {
        return lastTrainingDate;
    }
    public void setLastTrainingDate(String lastTrainingDate) {
        this.lastTrainingDate = lastTrainingDate;
    }
    public String getPayrollTotalValue() {
        return payrollTotalValue;
    }
    public void setPayrollTotalValue(String payrollTotalValue) {
        this.payrollTotalValue = payrollTotalValue;
    }


    public void setAuditing(Auditing aud) {
    }


    
}

package com.example.JoseRodolfo.controller.exception;

import java.util.Date;

public class StandardError {

    private String message;
    private Integer status;
    private Date date;

    public StandardError(String message, Integer status, Date date){
        super();
        this.message = message;
        this.status = status;
        this.date = date;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    
}

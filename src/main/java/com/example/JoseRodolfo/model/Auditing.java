package com.example.JoseRodolfo.model;

import java.time.LocalDateTime;

import javax.persistence.Id;

public class Auditing {

        @Id
        private String identifier;

        private String operation;

    private LocalDateTime date;

    public Auditing(){
        
    }

        public Auditing(String operation, LocalDateTime date){
            super();
            this.operation = operation;
            this.date = date;
        }

        public String getIdentifier() {
            return identifier;
        }

        public void setIdentifier(String identifier) {
            this.identifier = identifier;
        }

        public String getOperation() {
            return operation;
        }

        public void setOperation(String operation) {
            this.operation = operation;
        }

        public LocalDateTime getDate() {
            return date;
        }

        public void setDate(LocalDateTime date) {
            this.date = date;
        }

   

}

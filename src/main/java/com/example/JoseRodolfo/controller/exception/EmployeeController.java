package com.example.JoseRodolfo.controller.exception;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.JoseRodolfo.dto.EmployeeDTO;
import com.example.JoseRodolfo.model.Employee;
import com.example.JoseRodolfo.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping()
    public List<EmployeeDTO> getAllEmployees(){
        return service.getAllEmployees();
    }

    @GetMapping("/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable String id){
        Employee emp = service.getEmployeeId(id);
        return new EmployeeDTO(emp);
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void createEmployee(@RequestBody @Valid EmployeeDTO dto){
        service.createEmployee(dto);
    }

    @PostMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateEmployee(@RequestBody @Valid EmployeeDTO dto, @PathVariable String id){
        service.updateEmployee(dto, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEmployee(@PathVariable String id){
        service.deleteEmployee(id);
    }
    
}

package com.example.ElasticSearchDemoProject.controller;

import com.example.ElasticSearchDemoProject.model.Employee;
import com.example.ElasticSearchDemoProject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeRepository repository;
    @PostMapping
    public Employee create(@RequestBody Employee employee) {
        return repository.save(employee);
    }
    @GetMapping("/{id}")
    public Optional<Employee> findById(@PathVariable String id) {
        return repository.findById(id);
    }

    @GetMapping
    public Iterable<Employee> findAll() {
        return repository.findAll();
    }

    @PutMapping("/{id}")
    public Employee update(@PathVariable String id, @RequestBody Employee employee) {
        employee.setId(id);
        return repository.save(employee);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repository.deleteById(id);
    }
}
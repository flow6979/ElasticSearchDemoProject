package com.example.ElasticSearchDemoProject.repository;

import com.example.ElasticSearchDemoProject.model.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
public interface EmployeeRepository extends ElasticsearchRepository<Employee, String> {
}
package com.mehdi.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mehdi.spring.model.Employee;
import com.mehdi.spring.repository.EmployeeRepository;

@RestController
public class EmployeeRestController {

	@Autowired
	private EmployeeRepository repository;
	
	@GetMapping("/rest/employee/get/{id}")
	public Employee getEmployeeById(@PathVariable("id") int id) {
		return repository.retrieve(id);
	}
	
	@GetMapping("/rest/employee/getAll")
	public List<Employee> getAllEmployees() {
		return repository.getAll();
	}
	
	@PostMapping("/rest/employee/create")
	public Employee createEmployee(@RequestBody Employee emp) {
		repository.store(emp);
		return emp;
	}
	
	@GetMapping("/rest/employee/search/{name}")
	public Employee getEmployeeByName(@PathVariable("name") String name) {
		return repository.search(name);
	}
	
	@DeleteMapping("/rest/employee/delete/{id}")
	public Employee deleteEmployeeById(@PathVariable("id") int id) {
		return repository.delete(id);
	}
}

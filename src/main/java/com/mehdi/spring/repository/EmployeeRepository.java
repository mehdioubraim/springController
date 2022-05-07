package com.mehdi.spring.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.mehdi.spring.model.Employee;

@Repository
public class EmployeeRepository implements ObjectRepository<Employee> {

	private Map<Integer, Employee> repository;
	
	public EmployeeRepository() {
		this.repository = new HashMap<Integer, Employee>();
	}
	
	@Override
	public void store(Employee emp) {
		repository.put(emp.getId(), emp);
	}
	
	@Override
	public Employee retrieve(int id) {
		return repository.get(id);
	}
	
	public List<Employee> getAll() {
		List<Employee> emps = new ArrayList<Employee>();
		for (Employee emp : this.repository.values()) {
			emps.add(emp);
		}
		return emps;
	}
	
	@Override
	public Employee search(String name) {
		Collection<Employee> emps = repository.values();
		for (Employee e : emps) {
			if (e.getName().equalsIgnoreCase(name))
				return e;
			
		}
		return null;
	}
	
	@Override
	public Employee delete(int id) {
		Employee e = repository.get(id);
		this.repository.remove(id,e);
		return e;
	}
}

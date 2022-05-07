package com.mehdi.spring.model;

public class Employee {
	private int id;
	private String name;
	private String jobTitle;
	
	public Employee() {
		
	}
	
	public Employee(int i, String n, String jt) {
		this.id = i;
		this.name = n;
		this.jobTitle = jt;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int i) {
		this.id = i;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	
	public void setJobTitle(String jt) {
		this.jobTitle = jt;
	}
	
}

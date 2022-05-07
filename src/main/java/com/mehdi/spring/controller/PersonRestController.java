package com.mehdi.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mehdi.spring.model.Person;

@RestController
public class PersonRestController {

	@GetMapping("/rest")
	public String healthCheck() {
		return "OK";
	}
	
	@GetMapping("/rest/person/get")
	public Person getPerson(@RequestParam(name = "name", required = false, defaultValue = "Unknown") String name) {
		Person person = new Person();
		person.setName(name);
		return person;
	}
}

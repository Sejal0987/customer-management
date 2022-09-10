package com.cs.springbootapp.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cs.springbootapp.model.Employee;
import com.cs.springbootapp.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {
	
	@PostConstruct
	public void init() {
		log.info("Controller Instance Created");
	}
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/employees")
	public List<Employee> findAllEmployees(){
		return service.getAllEmployees();
	}
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee employee) {
		return service.addEmployee(employee);
	}
	
	@DeleteMapping("/employees/{id}")
	public boolean deleteEmployee(@PathVariable int id) {
		return service.deleteEmployee(id);
	}
	
	
	// Fetch Employee by Id
	@GetMapping("/employees/{id}")
	public Employee searchEmployee(@PathVariable int id) {
		return service.findEmployee(id);
	}
	

}

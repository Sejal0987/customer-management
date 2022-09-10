package com.cs.springbootapp.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs.springbootapp.model.Employee;
import com.cs.springbootapp.repository.EmployeeRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	
	@PostConstruct
	public void init() {
		log.info("Service Instance Created");
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return repo.saveEmployee(employee);
	}

	@Override
	public Employee findEmployee(int id) {
		return repo.getEmployee(id);
	}

	@Override
	public boolean deleteEmployee(int id) {
		return repo.deleteEmployee(id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return repo.getAllEmployees();
	}

}

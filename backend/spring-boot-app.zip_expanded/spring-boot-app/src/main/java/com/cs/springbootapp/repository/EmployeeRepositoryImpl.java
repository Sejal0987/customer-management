package com.cs.springbootapp.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;


import org.springframework.stereotype.Repository;

import com.cs.springbootapp.model.Employee;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

	private Map<Integer, Employee> employeeDb;
	
	@PostConstruct
	public void init() {
		
		employeeDb=new HashMap<>();
		Employee emp1= new Employee(1001, "Kunal", LocalDate.parse("2020-02-10"));
		Employee emp2= new Employee(1002, "Suraj", LocalDate.parse("2021-10-20"));
		Employee emp3= new Employee(1003, "Manish", LocalDate.parse("2020-04-25"));
		
		employeeDb.put(emp1.getId(), emp1);
		employeeDb.put(emp2.getId(), emp2);
		employeeDb.put(emp3.getId(), emp3);
		
	}
	
	public Employee saveEmployee(Employee employee) {
		employeeDb.put(employee.getId(), employee);
		return employee;
	}

	public Employee getEmployee(int id) {
		return employeeDb.get(id);
	}

	public boolean deleteEmployee(int id) {
		employeeDb.remove(id);
		return !employeeDb.containsKey(id);
	}

	public List<Employee> getAllEmployees() {
		List<Employee> employeeList = new ArrayList<>(employeeDb.values());
		return employeeList;
	}

}

package com.cs.springbootapp.repository;

import java.util.List;

import com.cs.springbootapp.model.Employee;

public interface EmployeeRepository {
	
	public Employee saveEmployee(Employee employee);
	
	public Employee getEmployee(int id);
	
	public boolean deleteEmployee(int id);
	
	public List<Employee> getAllEmployees();
	

}

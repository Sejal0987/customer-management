package com.cs.springbootapp.service;

import java.util.List;

import com.cs.springbootapp.model.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);

	public Employee findEmployee(int id);

	public boolean deleteEmployee(int id);

	public List<Employee> getAllEmployees();

}
 
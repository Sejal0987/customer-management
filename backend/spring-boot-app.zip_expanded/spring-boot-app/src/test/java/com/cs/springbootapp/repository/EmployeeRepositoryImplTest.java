package com.cs.springbootapp.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cs.springbootapp.model.Employee;

@SpringBootTest
class EmployeeRepositoryImplTest {
	
	@Autowired
	private EmployeeRepository repo;
	
	Employee employee = new Employee(2001,"Priyanka",LocalDate.of(2020, 10, 10));

	@Test
	void testSaveEmployee() {
		Employee savedEmployee = repo.saveEmployee(employee);
		assertEquals(employee, savedEmployee);
	}

//	@Test
//	void testGetEmployee() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testDeleteEmployee() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetAllEmployees() {
//		fail("Not yet implemented");
//	}

}

package com.cs.springbootapp.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	@JsonProperty("employeeId")
	private int id;
	
	private String employeeName;
	private LocalDate joinDate;
	
	
}

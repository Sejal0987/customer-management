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


import com.cs.springbootapp.model.Customer;
import com.cs.springbootapp.service.CustomerService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@CrossOrigin(origins = "http://localhost:4200")

public class CustomerController{
    @PostConstruct
	public void init() {
		log.info("Customer Controller Instance Created");
	}

    @Autowired
	private CustomerService service;

    @GetMapping("/customers")
	public List<Customer> findAllCustomers(){
		return service.getAllCustomer();
	}

    @PostMapping("/customer")
	public Customer addEmployee(@RequestBody Customer customer) {
		return service.addCustomer(customer);
	}

    @DeleteMapping("/customer/{id}")
	public boolean deleteEmployee(@PathVariable int id) {
		return service.deleteCustomer(id);
	}

    @GetMapping("/customer/{id}")
	public Customer searchEmployee(@PathVariable int id) {
		return service.findCustomer(id);
	}
}
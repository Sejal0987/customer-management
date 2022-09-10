package com.cs.springbootapp.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs.springbootapp.model.Customer;
import com.cs.springbootapp.repository.CustomerRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService{

    @Autowired
	private CustomerRepository repo; 
    
    @PostConstruct
	public void init() {
		log.info("Service Instance Created");
	}

	@Override
	public Customer addCustomer(Customer customer) {
		return repo.saveCustomer(customer);
	}

	@Override
	public Customer findCustomer(int customer_id) {
		return repo.getCustomer(customer_id);
	}

	@Override
	public boolean deleteCustomer(int customer_id) {
		return repo.deleteCustomer(customer_id);
	}

	@Override
	public List<Customer> getAllCustomer() {
		return repo.getAllCustomers();
	}

}
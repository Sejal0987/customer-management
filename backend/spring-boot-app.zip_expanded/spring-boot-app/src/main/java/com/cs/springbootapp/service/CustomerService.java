package com.cs.springbootapp.service;

import java.util.List;

import com.cs.springbootapp.model.Customer;

public interface CustomerService{

	public Customer addCustomer(Customer customer);

	public Customer findCustomer(int customer_id);

	public boolean deleteCustomer(int customer_id);

	public List<Customer> getAllCustomer();

}
 
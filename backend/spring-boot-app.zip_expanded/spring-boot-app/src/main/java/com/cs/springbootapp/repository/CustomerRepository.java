package com.cs.springbootapp.repository;

import java.util.List;

import com.cs.springbootapp.model.Customer;

public interface CustomerRepository {
    public Customer saveCustomer(Customer employee);
	
	public Customer getCustomer(int id);
	
	public boolean deleteCustomer(int id);
	
	public List<Customer> getCustomer();
}

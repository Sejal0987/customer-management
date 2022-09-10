package com.cs.springbootapp.repository;

import java.util.List;

import com.cs.springbootapp.model.Customer;

public interface CustomerRepository {
    public Customer getCustomer(int customer_id);
    public Customer saveCustomer(Customer customer);
    public boolean deleteCustomer(int customer_id);
    public List<Customer> getAllCustomers();


    
}

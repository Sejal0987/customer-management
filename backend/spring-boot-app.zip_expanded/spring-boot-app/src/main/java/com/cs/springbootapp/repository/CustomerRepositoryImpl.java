package com.cs.springbootapp.repository;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import com.cs.springbootapp.model.Customer;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository{
    private Map<Integer,Customer> customer_db;

    @PostConstruct
    public void init(){
        customer_db = new HashMap<>();

        Customer cust1 = new Customer(1,"Bill Gates","bill.gates@microsoft.com");
        Customer cust2 = new Customer(2,"Elon Musk","elon.musk@tesla.com");
        Customer cust3 = new Customer(3,"Mark Zukerberg","mark.zukerberg@facebook.com");

        customer_db.put(cust1.getCustomer_id(), cust1);
        customer_db.put(cust2.getCustomer_id(), cust2);
        customer_db.put(cust3.getCustomer_id(), cust3);


        
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        customer_db.put(customer.getCustomer_id(),customer);
        return customer;
    }


    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> customerList = new ArrayList<>(customer_db.values());
        return customerList;
    }

	@Override
	public Customer getCustomer(int customer_id) {
		return customer_db.get(customer_id);
	}

	@Override
	public boolean deleteCustomer(int customer_id) {
		customer_db.remove(customer_id);
		return !customer_db.containsKey(customer_id);
	}

}
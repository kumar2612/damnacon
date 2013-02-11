package com.damnacon.javaMavenSpringPgSMix.hs.data.service;

import java.util.List;

import com.damnacon.javaMavenSpringPgSMix.hs.data.model.Customer;

public interface CustomerService {
	public int insert(Customer customer);
	
	public int update(Customer customer);
	
	public int delete(Customer customer);
	
	public Customer findById(int customerId);
	
	public List<Customer> getAll();
}

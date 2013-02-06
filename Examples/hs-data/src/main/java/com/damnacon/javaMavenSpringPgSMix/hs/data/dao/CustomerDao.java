package com.damnacon.javaMavenSpringPgSMix.hs.data.dao;

import java.util.List;

import com.damnacon.javaMavenSpringPgSMix.hs.data.model.Customer;

public interface CustomerDao {

	public int insert(Customer customer);
	
	public int update(Customer customer);
	
	public int delete(Customer customer);
	
	public Customer findById(int customerId);
	
	public List<Customer> getAll();
}
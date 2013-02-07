package com.damnacon.javaMavenSpringPgSMix.hs.data.service.impl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.damnacon.javaMavenSpringPgSMix.hs.data.dao.CustomerDao;
import com.damnacon.javaMavenSpringPgSMix.hs.data.model.Customer;

public class CustomerServiceImpl {

	ApplicationContext context = 
			new ClassPathXmlApplicationContext("Spring-Module.xml");
	CustomerDao dao = (CustomerDao) context.getBean("customerDao");

	public int insert(Customer customer) {

		int status = dao.insert(customer);

		return status;
	}

	public int update(Customer customer) {

		int status = dao.update(customer); 

		return status; 
	}

	public int delete(Customer customer) {

		int status = dao.delete(customer);

		return status; 
	}

	public Customer findById(int customerId) {

		Customer customer = dao.findById(customerId);

		return customer;
	}

	public List<Customer> getAll() {

		List<Customer> customers  = dao.findAll();

		return customers;
	}
}

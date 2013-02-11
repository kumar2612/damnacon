package com.damnacon.javaMavenSpringPgSMix.hs.data.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.damnacon.javaMavenSpringPgSMix.hs.data.dao.CustomerDao;
import com.damnacon.javaMavenSpringPgSMix.hs.data.model.Customer;

@Transactional
public class CustomerDaoImpl extends JdbcDaoSupport  implements CustomerDao {

	public int insert(Customer customer) {
		
		String sql = "insert into Customer (customer_id, first_name, last_name, age, " +
				"adress, nationality, login, password) values(?, ?, ?, ?, ?, ?, ?, ?)";  
		Object[] args = {customer.getCustomerId(), customer.getFirstName(), 
				customer.getLastName(), customer.getAge(), customer.getAdress(),
				customer.getNationality(), customer.getLogin(), customer.getPassword()}; 
		
		int status = this.getJdbcTemplate().update(sql, args);
		
		return status;
	}

	public int update(Customer customer) {
		
		String sql = "update Customer set first_name = ?, last_name = ?, " +
				"age = ?, adress = ?, nationality = ?, login = ?, password = ?  where customer_id = ?";  
		Object[] args = {customer.getFirstName(), customer.getLastName(), customer.getAge(), 
				customer.getAdress(), customer.getNationality(), customer.getLogin(), 
				customer.getPassword(), customer.getCustomerId()}; 
		
		int status = this.getJdbcTemplate().update(sql, args);  
		
		return status; 
	}
	
	public int delete(Customer customer) {
		
		String sql = "delete from Customer where customer_id = ?";
		Object[] args = {customer.getCustomerId()};
		
		int status = this.getJdbcTemplate().update(sql, args);
		
		return status; 
	}
	
	public Customer findById(int customerId) {
		
		String sql = "select * from Customer where customer_id = ?";  
		Object[] args = {customerId};
		
		Customer customer = (Customer)getJdbcTemplate().queryForObject(sql, args, 
				new BeanPropertyRowMapper(Customer.class));
	 
		return customer;
	}
	
	public List<Customer> findAll() {
		
		String sql = "select * from Customer";
		 
		List<Customer> customers  = getJdbcTemplate().query(sql,
				new BeanPropertyRowMapper(Customer.class));
	 
		return customers;
	}
}

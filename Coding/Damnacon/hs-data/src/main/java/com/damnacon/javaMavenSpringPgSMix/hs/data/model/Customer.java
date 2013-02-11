package com.damnacon.javaMavenSpringPgSMix.hs.data.model;

import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

/**
 * Entity Customer : it represents a person that ask for a service of the hotel
 * 
 * @author NDI
 */
//@EqualsAndHashCode(of="id")	//Make the comparison on the id attribut only and not on all the attributs
@Data
@XmlRootElement
public class Customer {

	/**
	 * An an empty entity in order to standarsize the null equivalent for this entity
	 */
	public static final Customer EMPTY = new Customer();

	private int customerId;
	private String firstName;
	private String lastName;
	private int age;
	private String adress;
	private String nationality;
	private String login;
	private String password;

	/**
	 * Default constructor
	 * 
	 * @param firstName : the first name of the customer
	 * @param lastNname : the last name of the customer
	 * @param age : the age of the customer
	 * @param adress : the adress of the customer
	 * @param nationality : the nationality of the customer
	 * @param login : the login of the customer
	 * @param password : the password of the customer
	 */
	public Customer() {
		super();
	}

	public Customer(String firstName, String lastNname,
			int age, String adress, String nationality, String login, String password) {

		super();
		this.firstName = firstName;
		this.lastName = lastNname;
		this.age = age;
		this.adress = adress;
		this.nationality = nationality;
		this.login = login;
		this.password = password;
	}

	public Customer(Customer customer) {

		super();
		this.firstName = customer.firstName;
		this.lastName = customer.lastName;
		this.age = customer.age;
		this.adress = customer.adress;
		this.nationality = customer.nationality;
		this.login = customer.login;
		this.password = customer.password;
	}

}
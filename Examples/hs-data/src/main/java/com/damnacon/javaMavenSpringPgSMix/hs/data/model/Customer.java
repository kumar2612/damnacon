package com.damnacon.javaMavenSpringPgSMix.hs.data.model;

import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@XmlRootElement
@EqualsAndHashCode
public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private String adress;
}
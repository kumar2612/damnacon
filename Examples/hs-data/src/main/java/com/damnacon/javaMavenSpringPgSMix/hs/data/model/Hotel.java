package com.damnacon.javaMavenSpringPgSMix.hs.data.model;

import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@XmlRootElement
@EqualsAndHashCode
public class Hotel {
	private int id;
	private int name;
	private String adress;
}
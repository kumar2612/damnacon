package com.damnacon.javaMavenSpringPgSMix.hs.data.model;

import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@XmlRootElement
@EqualsAndHashCode
public class Room {
	private int id;
	private String name;
	private int nbBeds;
}

package com.damnacon.javaMavenSpringPgSMix.hs.data.model;

import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@XmlRootElement
@EqualsAndHashCode
public class Room {
	private int roomId;
	private int nbBeds;
	private float price;
}

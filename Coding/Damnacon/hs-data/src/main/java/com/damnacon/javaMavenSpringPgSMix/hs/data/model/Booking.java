package com.damnacon.javaMavenSpringPgSMix.hs.data.model;

import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@XmlRootElement
@EqualsAndHashCode
public class Booking {
	private int bookingId;
	private int ndRooms;
	private GregorianCalendar startDate;
	private GregorianCalendar endDate;
	Customer customerFk;
	List<Room> roomsFk;
}
package com.xworkz.jan11task.type;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Software {
	@Autowired
	@Qualifier("sName")
	private String name;
	@Autowired
	private double version;
	@Autowired
	private String developer;
	@Autowired
	private int date;
	@Autowired
	private boolean free;
	
	@Override
	public String toString() {
		return "Software [name=" + name + ", version=" + version + ", developer=" + developer + ", date=" + date
				+ ", free=" + free + "]";
	}
	
	
	

}

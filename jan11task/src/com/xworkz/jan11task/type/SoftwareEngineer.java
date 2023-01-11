package com.xworkz.jan11task.type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer {
	@Autowired
	@Qualifier("engineer")
	private String name;
	@Autowired
	@Qualifier("sSalary")
	private long salary;
	@Autowired
	private String companyName;
	@Autowired
	private double experience;
	
	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", salary=" + salary + ", companyName=" + companyName
				+ ", experience=" + experience + "]";
	}

	
}

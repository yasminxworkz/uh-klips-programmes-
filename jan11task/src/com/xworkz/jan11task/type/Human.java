package com.xworkz.jan11task.type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Human {
	
	@Autowired
	@Qualifier("humanName")
	private String name;
	@Autowired
	@Qualifier("noOfBooks")
	private byte noOfBooksWritten;
	@Autowired
	@Qualifier("workingYears")
	private short tenureAsScientist;
	@Autowired
	private int age;
	@Autowired
	private long salary;
	@Autowired
	private float weight;
	@Autowired
	private double height;
	@Autowired
	private char gender;
	@Autowired
	@Qualifier("alive")
	private boolean alive;
	
	@Override
	public String toString() {
		return "Human [name=" + name + ", noOfBooksWritten=" + noOfBooksWritten + ", tenureAsScientist="
				+ tenureAsScientist + ", age=" + age + ", salary=" + salary + ", weight=" + weight + ", height="
				+ height + ", gender=" + gender + ", alive=" + alive + "]";
	}
	
	

}

package com.xworkz.association.array.constructor;

public class Person {
	
	public String name;
	public Email[]emails;
	public Job job;
	
	public Person(String name) {
		this.name=name;
	}
	
	
	
	public void setMail(Email[]emails) {
		this.emails=emails;
	}
	
	public void setJob(Job job)
	{
		this.job=job;
	}
	
	
	public void displayDetails() {
		
		
		System.out.println(this.name);
		System.out.println(this.emails);
	
	
	}
}



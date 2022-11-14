package com.xworkz.association1.constructor;

public class JobCompany {
	public String name;
	public String ownerName;
	JobLocation jLocation;

	public JobCompany(String name, String ownerName) {
		this.name=name;
		this.ownerName=ownerName;
	}
	
	public void setJobLocation(JobLocation jLocation) {
		this.jLocation=jLocation;
	}
	public void display() {
		
		System.out.println("====printing company address====");

		System.out.println(" copmany name: " + name);
		System.out.println(" copmany ownerName: " + ownerName);

		

	}

}

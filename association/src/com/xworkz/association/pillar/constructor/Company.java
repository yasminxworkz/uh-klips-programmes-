package com.xworkz.association.pillar.constructor;

public class Company {
	 public String name;
	 public int types;
	 
	 public Company(String name,int types) {
		 this.name=name;
		 this.types=types;
	 }
	 
	 
	 
	 public void showOff() {
		 System.out.println("Company name: "+this.name);
		 System.out.println("Company types: "+this.types);
		 
	 }
	 
	 

}

package com.xworkz.inheritance.director.constructor;

public class Prashanth extends Director {
	public String profession;

	public Prashanth(String type, String movieName, String profession) {
		super(type, movieName);
		this.profession= profession;
		
	}
	
	public void display() {
		super.display();
		System.out.println(profession);
	}

}

package com.xworkz.inheritance.director.constructor;

public class Director {
	public String type;
	public String movieName;
	
	public Director(String type, String movieName) {
		super();
		this.type = type;
		this.movieName = movieName;
	}
	
	public void display() {
		System.out.println(type);
		System.out.println(movieName);
	}

}

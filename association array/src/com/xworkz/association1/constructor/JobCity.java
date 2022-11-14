package com.xworkz.association1.constructor;

public class JobCity {
	
	public String name;
	public  boolean isDistrict;
	public int pinCode;
	public int population;
	
	public JobCity(String name, boolean isDistrict, int pinCode, int population) {
		this.name=name;
		this.isDistrict=isDistrict;
		this.pinCode=pinCode;
		this.population=population;
	}
	public void display() {
		System.out.println("====printing company's city details====");

		System.out.println(" city name : " + name);
		System.out.println(" isDistrict : " + isDistrict);
		System.out.println(" city pinCode : " + pinCode);
		System.out.println(" city population : " + population);

	}

}

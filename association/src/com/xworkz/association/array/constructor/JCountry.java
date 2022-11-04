package com.xworkz.association.array.constructor;

public class JCountry {
	public String name;
	public String capital;
	public int noOfStates;
	public String president;
	
	public JCountry(String name, String capital,int noOfStates,String president) {
		this.noOfStates=noOfStates;
		this.president=president;
		this.name=name;
		this.capital=capital;
	}
	
	public void displayDetails() {
		System.out.println(this.noOfStates);
		System.out.println(this.president);
		System.out.println(this.name);
		System.out.println(this.capital);
	}

}

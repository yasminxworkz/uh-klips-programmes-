package com.xworkz.association.array.constructor;

public class Country {
	public String name="India";
	public String capital="NewDelhi";
	public int noOfStates;
	public String president;
	
	public Country(int noOfStates,String president) {
		this.noOfStates=noOfStates;
		this.president=president;
	}
	
	public void displayDetails() {
		System.out.println(this.noOfStates);
		System.out.println(this.president);
		System.out.println(name);
		System.out.println(capital);
	}

}

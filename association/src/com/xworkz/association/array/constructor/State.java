package com.xworkz.association.array.constructor;

public class State {
	public String name;
	public String capital;
	public int noOfcities;
	public String chiefMinister;
	
	public State(String name, String capital) {
		this.name=name;
		this.capital=capital;	
	}
	
	public void setStateProperties(int noOfcities,String chiefMinister) {
		this.noOfcities=noOfcities;
		this.chiefMinister=chiefMinister;
		
	}
	
	public void displayDetails() {
		System.out.println(this.name);
		System.out.println(this.capital);
		System.out.println(this.noOfcities);
		System.out.println(this.chiefMinister);
	

}
}

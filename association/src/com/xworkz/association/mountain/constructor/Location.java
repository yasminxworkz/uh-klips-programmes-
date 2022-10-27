package com.xworkz.association.mountain.constructor;

public class Location {
	
	public String city;
	public String state;
	public int pinCode;
	public String country;
	public Temple temple=new Temple("kedarnath","Rawal",12000,15000);
	
	
	
	
	public Location ( String city,String state,int pinCode,String country) {
		
		this.city=city;
		this.state=state;
		this.pinCode=pinCode;
		this.country=country;
		
	}
	
	
	
	public void showOff() {
		System.out.println("======printng details of location====");
		System.out.println(this.city);
		System.out.println(this.state);
		System.out.println(this.pinCode);
		System.out.println(this.country);
		temple.showOff();
		
	}

}

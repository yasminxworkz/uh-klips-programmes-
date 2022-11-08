package com.xworkz.association.fuel.constructor;

public class BrandLocation {
	
	public String headquarters;//mumbai
	public int pinCode;//400029
	public String state="maharashtra";
	public String country="India";
	
	public BrandLocation(String headquarters,int pinCode) {
		this.headquarters=headquarters;
		this.pinCode=pinCode;
	}
	
	public void showOff() {
		System.out.println("********************BrandLocation Details************************");
		System.out.println("headquarters: "+this.headquarters);
		System.out.println("pincode: "+pinCode);
		System.out.println("state: "+state);
		System.out.println("country: "+country);
	}

}

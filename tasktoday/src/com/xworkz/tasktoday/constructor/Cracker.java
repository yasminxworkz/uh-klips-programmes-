package com.xworkz.tasktoday.constructor;

public class Cracker {
	
	public String type="rocket";
	public int price;
	public double quantity;
	public static String companyName;
	public String usedAt;
	
	public Cracker(double quantity) {
		this.quantity=quantity;
	}
	
	public void setUsedAt() {
		usedAt="festivals";
	}
	
	public void display() {
		
		System.out.println("cracker type: "+type);
		System.out.println("cracker price: "+price);
		System.out.println("cracker quantity: "+this.quantity);
		System.out.println("cracker companyName: "+companyName);
		System.out.println("cracker usedAt: "+usedAt);
		
	}

}

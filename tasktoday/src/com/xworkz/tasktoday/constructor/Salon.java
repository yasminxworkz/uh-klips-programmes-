package com.xworkz.tasktoday.constructor;

public class Salon {
	
	public String name;
	public String location="Gadag";
	public static int noOfHairCutstyles;
	public int salonRent;
	public boolean acRoom;
	
	public Salon(String name) {
		this.name=name;
	}
	
	public void setSalonRent() {
		salonRent=200;
	}
	
	public void display() {
		System.out.println("salon name: "+this.name);
		System.out.println("salon location: "+location);
		System.out.println("noOfHairCutstyles: "+noOfHairCutstyles);
		System.out.println("salonRent: "+salonRent);
		System.out.println("acRoom: "+acRoom);
	}

}

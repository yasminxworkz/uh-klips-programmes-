package com.xworkz.association.mountain.constructor;

public class Mountain {

	public String name;
	public double height;
	public Location location = new Location("Rudraprayag","uttarakhand", 246445, "India");

	

	public Mountain(String name) {
		
		this.name = name;

	}

	public void trecking(double height) {
		this.height = height;

	}

	public void showOff() {
		System.out.println("======printng details of mountain====");
		System.out.println(this.name);
		System.out.println(this.height);
		location.showOff();

	}

}

package com.xworkz.encapsulation.grinder.constructor;

public class Grinder {
	String brand;
	int price;
	double motorHP;
	int noOfJars;
	String type;
	String brandAmbassador="Sanjeev kapoor";
	String shape="cylindrical";
	private String color;
	private String function;
	private String owner;
	private String manufacturedAt;
	
	public String getColor() {
		return color;
	}
	
	void setColor(String color) {
		this.color=color;
	}
	
	public String getFunction() {
		return function;
	}
	
	void setFunction(String function) {
		this.function=function;
	}
	
	public String getOwner() {
		return owner;
	}
	
	void setOwner(String owner) {
		this.owner=owner;
	}
	
	public String getManufacturedAt() {
		return manufacturedAt;
	}
	
	void setManufacturedAt(String manufacturedAt) {
		this.manufacturedAt=manufacturedAt;
	}

}

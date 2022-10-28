package com.xworkz.tasktoday.constructor;

import com.xworkz.tasktoday.constants.FlowerName;

public class Flower {

	public String color;
	public double quantity;
	public  int price;
	public int noOfTypes;
	public final String shopName = "Maniyar";
	public FlowerName name = FlowerName.JASMINE;
	public static String size;

	

	public Flower(String color, double quantity) {

		this.color = color;
		this.quantity = quantity;
	}

	public void setPrice(int money) {
		money = price;

	}

	public void display() {
		System.out.println("Flower FlowerName: "+FlowerName.JASMINE);
		System.out.println("Flower color: "+this.color);
		System.out.println("Flower quantity: "+this.quantity);
		System.out.println("Flower size: "+size);
		System.out.println("Flower price: "+price);
		System.out.println("noOfCustomers: "+noOfTypes);
		System.out.println("Flower shopName: "+shopName);
		
		

		

	}

}

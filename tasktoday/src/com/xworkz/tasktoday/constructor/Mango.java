package com.xworkz.tasktoday.constructor;

public class Mango {
	
	public String name="totapuri";
	public static String color;
	public double quantity;
	public int price;
	public String taste;
	
	public Mango(int price) {
		this.price=price;
	}
	
	public void setTaste() {
		taste="sweet";
		}
	
	public void display() {
		System.out.println("Mango name: "+name);
		System.out.println("Mango price: "+this.price);
		System.out.println("Mango taste: "+taste);
		System.out.println("Mango quantity: "+quantity);
		System.out.println("Mango color: "+color);
	}
	

}

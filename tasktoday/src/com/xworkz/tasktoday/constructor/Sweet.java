package com.xworkz.tasktoday.constructor;

public class Sweet {
	
	public String name="motichoorLaddu";
	public double quantity;
	public int price;
	public static String color;
	public String shopName;
	
	public Sweet(int price) {
		this.price=price;
	}
	
	public void setQuantity() {
		quantity=250d;
	}
	
	public void display() {
		
		System.out.println("sweetname: "+name);
		System.out.println("quantity: "+quantity);
		System.out.println("price: "+this.price);
		System.out.println("color: "+color);
		System.out.println("shopName: "+shopName);
		
	}

}

package com.xworkz.inheritance.shoppingmall.constructor;

public class ShoppingMall {
	public String location;
	public int dailyVisitors;
	
	public ShoppingMall(String location, int dailyVisitors) {
		super();
		this.location = location;
		this.dailyVisitors = dailyVisitors;
	}

	public void display() {
		System.out.println(location);
		System.out.println(dailyVisitors);
	}
	

}

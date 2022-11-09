package com.xworkz.inheritance.shoppingmall.constructor;

public class Orion extends ShoppingMall{
	public boolean isMall;
	
	
	public Orion(String location, int dailyVisitors,boolean isMall) {
		super(location, dailyVisitors);
		this.isMall=isMall;
	}
	
	public void display() {
		super.display();
		System.out.println(dailyVisitors);
	}
	
	

	
	
	
	

}

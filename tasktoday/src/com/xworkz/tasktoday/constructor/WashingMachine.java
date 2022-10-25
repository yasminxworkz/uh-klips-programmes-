package com.xworkz.tasktoday.constructor;

import com.xworkz.tasktoday.constants.WashingType;

public class WashingMachine {
	
	public String color;
	public String type;
	public double quantity;
	public WashingType washmachine;
	public String[]brands;
	
	public WashingMachine(String color,String type,double quantity,String[]brands,WashingType washmachine) {
		
	   this.color=color;
	   this.type=type;
	   this.quantity=quantity;
	   this.brands=brands;
	   this.washmachine=washmachine;
	   
	   
	}
	
	public void displayDetails()
	{
		System.out.println("color "+color);
		System.out.println("type "+type);
		System.out.println("quantity "+quantity);
		System.out.println("WashingType "+WashingType.GENTLE);
		System.out.println("load "+washmachine.load);
		System.out.println("OWNER "+washmachine.owner);

		

		

		System.out.println("brands of washingmachine are:---");
		
		for(int i=0;i<brands.length;i++) {
			
			System.out.println(brands[i]);
			
		}
		
		
	}

}

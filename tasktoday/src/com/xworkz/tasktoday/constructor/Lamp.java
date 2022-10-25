package com.xworkz.tasktoday.constructor;

import com.xworkz.tasktoday.constants.LampType;

public class Lamp {
	
	public String color;
	public boolean working;
	public int price;
	public static String lampMaterial;
	public String shopName="balaji";
	public LampType typeOfLamp=LampType.HANGING;
	
	public Lamp(String color) {
		
		this.color=color;
		
	}
	
	public void setPrice() {
		price=855;
	}
	
	public void display() {
		
		System.out.println("lamp color: "+this.color);
		System.out.println("working: "+working);
		System.out.println("lamp price: "+price);
		System.out.println("LampType: "+LampType.HANGING);
		System.out.println("lampMaterial: "+lampMaterial);
		System.out.println("shopName: "+shopName);
		
	}
	
	

}

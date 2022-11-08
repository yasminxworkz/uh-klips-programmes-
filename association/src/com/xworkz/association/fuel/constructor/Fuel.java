package com.xworkz.association.fuel.constructor;

import com.xworkz.association.fuel.constants.FuelType;

public class Fuel {
	
	public boolean special;
	public int price;
	public double quantity;
	public FuelType type=FuelType.PETROL;
	public Brand brand=new Brand("BharatPetroleum");
	
	public Fuel(boolean special,int price) {
		this.special=special;
		this.price=price;
	}
	
	public void run(double quantity) {
		this.quantity=quantity;
	}
	
	public void showOff() {
		
		System.out.println("special: "+this.special);
		System.out.println("price: "+this.price);
		System.out.println("quantity: "+quantity);
		System.out.println("fueltype: "+type);
		brand.showOff();
		
	}
}

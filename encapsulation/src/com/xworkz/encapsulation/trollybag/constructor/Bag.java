package com.xworkz.encapsulation.trollybag.constructor;

public class Bag {
	TrollyBag trolly=new TrollyBag();
	
	public void setTrollyBag() {
		trolly.bagMaterial="polycarbonate";
		trolly.brand="skybags";
		trolly.brandAmbassador="varun dhawan";	
	}
	
	public void use() {
		System.out.println("bagMaterial:"+this.trolly.bagMaterial);
		System.out.println("brand:"+this.trolly.brand);
		System.out.println("brandAmbassador:"+this.trolly.brandAmbassador);
		
		System.out.println("color: "+trolly.color);
		System.out.println("noOfWheels: "+trolly.noOfWheels);
		System.out.println("price: "+trolly.price);
		System.out.println("easyToHandle: "+trolly.easyToHandle);
		System.out.println("*****************private access specifier************");

		trolly.setbagCompanyRevenue(60000000l);
		System.out.println(trolly.getbagCompanyRevenue());
		
		trolly.setCompanyOwner("dilip");
		System.out.println(trolly.getCompanyOwner());
		
		trolly.setManufacturedAt("pune");
		System.out.println(trolly.getManufacturedAt());
		
		trolly.setweightLimit(7.5d);
		System.out.println(trolly.getweightLimit());
		
		trolly.settype("rolling luggage");
		System.out.println(trolly.gettype());
		
		trolly.setnoOfCompartments(4);
		System.out.println(trolly.getnoOfCompartments());
		
		
	}

}

package com.xworkz.taskToday.boot;

import com.xworkz.taskToday.constructor.Cigarette;

public class CigaretteRunner {

	public static void main(String[] args) {
		
		Cigarette cigarette=new Cigarette();
		System.out.println("values assigned using literals");
		System.out.println("brand: "+cigarette.brand);
		System.out.println("name: "+cigarette.name);
		System.out.println("colour: "+cigarette.colour);
		System.out.println("content: "+cigarette.content);
		System.out.println("company: "+cigarette.company);
		System.out.println("appearance: "+cigarette.appearance);
		System.out.println("quantity: "+cigarette.quantity);
		System.out.println("price: "+cigarette.price);
		System.out.println("manufactured year: "+cigarette.mfgYear);
		
		cigarette.expiryYear=2024;
		cigarette.harmful=true;
		cigarette.available=true;
		cigarette.famousIn="India";
		cigarette.plantLocation="goa";
		cigarette.harmedPersons=100000000;
		cigarette.quality="good";
		cigarette.smell="too strong";
		cigarette.companyRevenue=8000000000d;
	
		System.out.println("----------------------------------------------------");
		System.out.println("values assigned using instantiation");
		System.out.println("Expiry year: "+cigarette.expiryYear);
		System.out.println("is harmful: "+cigarette.harmful);
		System.out.println("is available: "+cigarette.available);
		System.out.println("famousIn: "+cigarette.famousIn);
		System.out.println("plantLocation: "+cigarette.plantLocation);
		System.out.println("harmedPersons: "+cigarette.harmedPersons);
		System.out.println("quality: "+cigarette.quality);
		System.out.println("smell: "+cigarette.smell);
		System.out.println("companyRevenue: "+cigarette.companyRevenue);



	

	}

}

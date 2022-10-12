package com.xworkz.taskToday.boot;

import com.xworkz.taskToday.constructor.RMD;

public class RMDRunner {

	public static void main(String[] args) {
		RMD packet=new RMD();
		System.out.println("values assigned using literals");
		System.out.println("brand: "+packet.brand);
		System.out.println("name: "+packet.name);
		System.out.println("colour: "+packet.colour);
		System.out.println("content: "+packet.content);
		System.out.println("company: "+packet.company);
		System.out.println("appearance: "+packet.appearance);
		System.out.println("quantity: "+packet.quantity);
		System.out.println("price: "+packet.price);
		System.out.println("manufactured year: "+packet.mfgYear);
		
		packet.expiryYear=2024;
		packet.harmful=true;
		packet.available=true;
		packet.usedAs="Chewing item";
		packet.fullForm="Rasiklal Manikchand Dhariwal";
		packet.harmedPersons=100000000;
		packet.quality="good";
		packet.smell="too strong";
		packet.companyRevenue=8000000000d;
	
		System.out.println("----------------------------------------------------");
		System.out.println("values assigned using instantiation");
		System.out.println("Expiry year: "+packet.expiryYear);
		System.out.println("is harmful: "+packet.harmful);
		System.out.println("is available: "+packet.available);
		System.out.println("famousIn: "+packet.usedAs);
		System.out.println("Full form of RMD: "+packet.fullForm);
		System.out.println("harmedPersons: "+packet.harmedPersons);
		System.out.println("quality: "+packet.quality);
		System.out.println("smell: "+packet.smell);
		System.out.println("companyRevenue: "+packet.companyRevenue);




	

	}

}

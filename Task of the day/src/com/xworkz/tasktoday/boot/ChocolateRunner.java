package com.xworkz.tasktoday.boot;

import com.xworkz.tasktoday.constructor.Chocolate;

public class ChocolateRunner {
	public static void main(String[] args) {
		Chocolate chocolate1=new Chocolate();
		System.out.println(chocolate1.name);
		System.out.println(chocolate1.brand);
		System.out.println(chocolate1.flavour);
		System.out.println(chocolate1.price);
		
		chocolate1.name="kitkat";
		chocolate1.brand="nestle";
		chocolate1.flavour="chocolate";
		chocolate1.price=40;
		
		System.out.println(chocolate1.name);
		System.out.println(chocolate1.brand);
		System.out.println(chocolate1.flavour);
		System.out.println(chocolate1.price);
		
	}
	
	
	

}

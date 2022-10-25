package com.xworkz.tasktoday.boot;

import com.xworkz.tasktoday.constructor.Milk;

public class MilkRunner {

	public static void main(String[] args) {
		
		Milk haalu=new Milk("rasgulla");
		haalu.setpackagingMaterial();
		haalu.price=45;
		Milk.brand="amul";
		haalu.display();
		

	}

}

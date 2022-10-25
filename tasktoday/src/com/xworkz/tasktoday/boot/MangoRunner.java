package com.xworkz.tasktoday.boot;

import com.xworkz.tasktoday.constructor.Mango;

public class MangoRunner {

	public static void main(String[] args) {
		
		Mango aam=new Mango(850);
		aam.quantity=1000d;
		aam.setTaste();
		Mango.color="orange";
		aam.display();
	}

}

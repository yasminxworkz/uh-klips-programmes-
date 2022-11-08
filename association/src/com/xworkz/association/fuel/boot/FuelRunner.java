package com.xworkz.association.fuel.boot;

import com.xworkz.association.fuel.constructor.Fuel;

public class FuelRunner {

	public static void main(String[] args) {
		Fuel fuel=new Fuel(true,101);
		fuel.run(2);
		fuel.showOff();
		

	}

}

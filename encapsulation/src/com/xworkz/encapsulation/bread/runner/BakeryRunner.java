package com.xworkz.encapsulation.bread.runner;

import com.xworkz.encapsulation.bread.constructor.Bakery;
import com.xworkz.encapsulation.bread.constructor.Bread;

public class BakeryRunner {

	public static void main(String[] args) {
		Bread bread=new Bread();
		Bakery bakery=new Bakery();
		bakery.setBread();
		bread.getBrand();
		bread.getBrandAmbassador();
		bread.getBreadSweet();
		bread.getBreadSweet();
		bakery.use();

	}

}

package com.xworkz.encapsulation.bread.runner;

import com.xworkz.encapsulation.bread.constructor.Bakery;
import com.xworkz.encapsulation.bread.constructor.Bread;

public class BakeryRunner {

	public static void main(String[] args) {
		
		Bakery bakery=new Bakery();
		bakery.setBread();
		bakery.use();

	}

}

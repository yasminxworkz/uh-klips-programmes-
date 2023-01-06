package com.xworkz.alltopics.encapsulation.boot;

import com.xworkz.alltopics.encapsulation.thing.Laptop;

public class LaptopRunner {

	public static void main(String[] args) {
		
		Laptop l=new Laptop();
		l.setColor("red");
		l.getColor();
		l.setNoOfKeys(100);
		l.getNoOfKeys();

		System.out.println(l.getColor());
		System.out.println(l.getNoOfKeys());
	}

}

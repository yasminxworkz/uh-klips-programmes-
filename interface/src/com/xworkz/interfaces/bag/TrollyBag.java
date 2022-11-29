package com.xworkz.interfaces.bag;

public class TrollyBag implements Bag {

	@Override
	public void shapes() {
	System.out.println("square");
		
	}

	@Override
	public void color() {
		System.out.println("red");
		
	}

	@Override
	public void quantity() {
		System.out.println(8);
		
	}

	@Override
	public void brand() {
		System.out.println("Zara");
		
	}

	@Override
	public void type() {
		System.out.println("travelling bag");
		
	}
	
	public boolean goodQuality() {
		System.out.println("true");
		return true;
	}

	

	

}

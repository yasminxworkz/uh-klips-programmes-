package com.xworkz.interfaces.bottle;

public class Cello implements Bottles {

	@Override
	public void type() {
		System.out.println("water bottle");
		
	}

	@Override
	public void quantity() {
		System.out.println("2 litres");
		
	}

	@Override
	public void brand() {
		System.out.println("cello");
		
	}

	@Override
	public void color() {
		System.out.println("black");
		
	}

	@Override
	public void shape() {
		System.out.println("cylibdrical");
		
	}
	
	public boolean isComfort() {
		System.out.println("is comfortable");
		return true;
	}
	

}

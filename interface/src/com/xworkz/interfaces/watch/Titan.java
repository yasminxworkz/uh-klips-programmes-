package com.xworkz.interfaces.watch;

public class Titan implements Watch{

	@Override
	public void type() {
		System.out.println("wrist watch");
		
	}

	@Override
	public void color() {
		System.out.println("brown");
		
	}

	@Override
	public boolean working() {
		System.out.println("running");
		return false;
	}

	@Override
	public String dialShape() {
		System.out.println("round");
		return "round";
	}

	@Override
	public void noOfDigitsOfTime() {
		System.out.println("12");
		
	}
	
	public boolean isQualityGood() {
		return true;
	}
	

}

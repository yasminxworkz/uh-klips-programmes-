package com.xworkz.interfaces.shirt;

public class TShirt implements Clothes {

	@Override
	public void type(String type) {
		
	}

	@Override
	public void size(String Size) {
		System.out.println("XL");
		
		
	}

	@Override
	public void color(String color) {
		System.out.println("red");
		
	}

	@Override
	public void brand(String brand) {
		System.out.println("polo");
		
	}

	@Override
	public void noOfPieces(int noOfPieces) {
		System.out.println("ten");
		
	}

	@Override
	public void type() {
		// TODO Auto-generated method stub
		
	}
	
	public boolean isgood() {
		return true;
	}

	
	


}

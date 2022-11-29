package com.xworkz.interfaces.invitation;

public class WeddingInvitation implements Invitation {

	@Override
	public void cardType() {
		
		System.out.println("wedding card"); 
	}

	@Override
	public void venue() {
		System.out.println("bagalkot");
		
		
	}

	@Override
	public void month() {
		System.out.println("february");
		
	}

	@Override
	public void cardSize() {
		System.out.println("medium");
		
	}

	@Override
	public void cardQuality() {
		System.out.println("good quality");
		
	}
	
	public boolean isConfirmDate() {
		System.out.println("true");
		return true;
		
	}

}

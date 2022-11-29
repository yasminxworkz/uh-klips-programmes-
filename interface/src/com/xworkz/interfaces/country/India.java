package com.xworkz.interfaces.country;

public class India implements Country {

	@Override
	public void name() {
		System.out.println("India");
		
	}

	@Override
	public void population() {
		System.out.println("one thirty crore");
		
	}

	@Override
	public void language() {
		System.out.println("hindi is a national language");
		
	}

	@Override
	public void president() {
		System.out.println("president is the head of India");
		
	}

	@Override
	public void capital() {
		System.out.println("delhi is capital of India");
		
	}
	
	public boolean isFamous() {
		System.out.println("India is a country of culture");
		return true;
	}

}

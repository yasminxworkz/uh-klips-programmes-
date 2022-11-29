package com.xworkz.interfaces.window;

public class Sliding implements Windows {

	@Override
	public void type() {
		System.out.println("sliding");
		
	}

	@Override
	public boolean sliding() {
		System.out.println("it is sliding window");
		return false;
	}

	@Override
	public void noOfWindows() {
		System.out.println("10");
		
	}

	@Override
	public void material() {
		System.out.println("glass");
		
	}

	@Override
	public int length() {
		System.out.println("five feet");
		return 6;
	}
	
	public boolean isFlexible() {
		return true;
	}

}

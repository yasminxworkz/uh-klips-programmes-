package com.xworkz.interfaces.hotel;

public class Kaamat implements Hotel{

	@Override
	public void name() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void location() {
		System.out.println("gadag");
		
	}

	@Override
	public void noOfWaiters() {
		System.out.println("more than 50");
		
	}

	@Override
	public void floors() {
		System.out.println("2");
		
	}

	@Override
	public boolean working() {
		System.out.println("14Hrs open");
		return true;
	}
	
	public boolean isGood() {
		System.out.println("is good hotel");
		return true;
	}

}

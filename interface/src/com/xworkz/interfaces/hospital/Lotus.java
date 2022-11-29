package com.xworkz.interfaces.hospital;

public class Lotus implements Hospital {

	@Override
	public void name() {
		System.out.println("lotus hospital");
		
	}

	@Override
	public void location() {
		System.out.println("situated in bangalore");
		
	}

	@Override
	public void noOfStaff() {
		System.out.println("staff is more than hundred");
		
	}

	@Override
	public void floors() {
		System.out.println("four");
		
	}

	@Override
	public boolean working() {
		System.out.println("hospital is open");
		return false;
	}
	
	public int workingHrs() {
		System.out.println("24Hrs");
		return 24;
	}

}

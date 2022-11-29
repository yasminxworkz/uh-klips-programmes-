package com.xworkz.interfaces.school;

public class Railway implements School {

	@Override
	public void name() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void location() {
		System.out.println("gadag");
		
	}

	@Override
	public void noOfStudents() {
		System.out.println("200");
		
	}

	@Override
	public void floors() {
		System.out.println("single");
		
	}

	@Override
	public boolean working() {
		System.out.println("working");
		return false;
	}
	
	public boolean open() {
		System.out.println("false");
		return false;
	}

}

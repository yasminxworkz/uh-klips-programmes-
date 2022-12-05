package com.xworkz.abstraction.abstracts;

public class JavaTrainee extends Person implements XWorkzRule {

	public JavaTrainee(String name, String location, int age, double weight, boolean isWorking) {
		super(name, location, age, weight, isWorking);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean uploadedTask() {
		System.out.println("uploaded the todays task");
		return false;
	}

	@Override
	public boolean completedProgram() {
		System.out.println("false");
		return false;
	}

	@Override
	void eat() {
		System.out.println("eat healthy foods");
		
	}

	@Override
	void sleep() {
		System.out.println("sleep of 6hrs is compulsary");
		
	}
	
	boolean training() {
		return true;
	}
	
	void executeProgram() {
		
	}

}

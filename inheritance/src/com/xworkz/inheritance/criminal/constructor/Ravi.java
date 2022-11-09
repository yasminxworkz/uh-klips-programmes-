package com.xworkz.inheritance.criminal.constructor;

public class Ravi extends Criminal{
	
	public int age;

	public Ravi(String crime, int imprisonment,int age) {
		super(crime, imprisonment);
		this.age=age;
		
	}
	
	public void display() {
		super.display();
		System.out.println(age);
	}

}

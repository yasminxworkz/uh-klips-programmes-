package com.xworkz.inheritance.criminal.constructor;

public class Criminal {
	public String crime;
	public int imprisonment;
	
	public Criminal(String crime, int imprisonment) {
		super();
		this.crime = crime;
		this.imprisonment = imprisonment;
	}
	
	public void display() {
		System.out.println(crime);
		System.out.println(imprisonment);
	}
	

}

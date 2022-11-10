package com.xworkz.inheritance.criminal.constructor;

public class Criminal {
	public String crime;
	public int imprisonment;
	
	public Criminal(String crime, int imprisonment) {
		super();
		this.crime = crime;
		this.imprisonment = imprisonment;
		System.out.println(System.lineSeparator());
		System.out.println(crime);
		System.out.println(imprisonment);
	}
	
	public void display() {
		System.out.println(crime);
		System.out.println(imprisonment);
	}
	

}

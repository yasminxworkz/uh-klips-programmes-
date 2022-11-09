package com.xworkz.inheritance.satellite.constructor;

public class Satellite {
	public int type;
	public String usedFor;
	
	public Satellite(int type, String usedFor) {
		super();
		this.type = type;
		this.usedFor = usedFor;
	}
	
	public void display() {
		System.out.println(type);
		System.out.println(usedFor);
	}
	
	

}

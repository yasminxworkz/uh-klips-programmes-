package com.xworkz.inheritance.satellite.constructor;

public class Moon extends Satellite {
	public boolean naturalSatellite;

	public Moon(int type, String usedFor,boolean naturalSatellite) {
		super(type, usedFor);
		this.naturalSatellite= naturalSatellite;
		
	}
	
	public void display() {
	    super.display();
		System.out.println(this.naturalSatellite);
	}
	

}

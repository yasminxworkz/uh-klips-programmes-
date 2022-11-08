package com.xworkz.association.mountain.constructor;

public class God {

	public String name;
	public String gender;
	public boolean powerfull;
	Weapon weapon=new Weapon("trishul","protection",4.2d);
	
	public God(String name,String gender,boolean powerfull) {
		this.name=name;
		this.gender=gender;
		this.powerfull=powerfull;
		
	}
	
	public void showOff() {
		System.out.println("======printng details of god====");
		System.out.println(this.name);
		System.out.println(this.gender);
		System.out.println(this.powerfull);
		weapon.showOff();
	}

}

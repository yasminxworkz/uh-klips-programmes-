package com.xworkz.inheritance.politicalparty.constructor;

public class PoliticalParty {
	public String name;
	public int members;
	
	public PoliticalParty(String name, int members) {
		super();
		this.name = name;
		this.members = members;
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(members);
	}
	
	

}

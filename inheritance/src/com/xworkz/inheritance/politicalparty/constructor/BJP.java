package com.xworkz.inheritance.politicalparty.constructor;

public class BJP extends PoliticalParty {
	
	public String president;
	
	public BJP(String name, int members,String president) {
		super(name, members);
		this.president=president;
		
	}
	
	public void display() {
		super.display();
		System.out.println(president);
	}

	

}

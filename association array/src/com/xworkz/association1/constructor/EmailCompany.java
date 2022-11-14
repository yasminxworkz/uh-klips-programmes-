package com.xworkz.association1.constructor;

public class EmailCompany {
	public String name;
	public String ownerName;
	EmailLocation elocation;

	
	public void setNames(String name, String ownerName) {
		this.name=name;
		this.ownerName=ownerName;
	}
	
	public void setLocation(EmailLocation elocation) {
		this.elocation=elocation;
	}
	public void display() {
		
		System.out.println("====printing email company address====");

		System.out.println(" copmany name: " + name);
		System.out.println(" copmany ownerName: " + ownerName);
       elocation.display();
       

	}

}

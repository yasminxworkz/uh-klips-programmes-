package com.xworkz.association.array.constructor;

public class EmailCompany {
	public String name;
	public String ownername;
	public CompanyLocation location;
	
	public void setEmailCompany(String name,String ownername) {
		this.name=name;
		this.ownername=ownername;
		
	}
	
	public void displayDetails() {
		System.out.println(this.name);
		System.out.println(this.ownername);
		location.displayDetails();
	}

}

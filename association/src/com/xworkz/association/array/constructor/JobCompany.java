package com.xworkz.association.array.constructor;

public class JobCompany {
	public String name;
	public String ownername;
	public JCompanyLocation location;
	
	public void setJobCompany(String name,String ownername) {
		this.name=name;
		this.ownername=ownername;
		
	}
	
	public void displayDetails() {
		
		System.out.println(this.name);
		System.out.println(this.ownername);
	}

}

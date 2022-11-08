package com.xworkz.association.array.constructor;

public class JCompanyLocation {
	public String street;
	public int no;
	public JCity city;
	public JState state;
	public JCountry country;
	
	public JCompanyLocation(String street,int no) {
		this.street=street;
		this.no=no;
	}
	
	public void displayDetails() {
		if (city!=null) {
			city.displayDetails();
		}
		else {
			System.out.println("city is null");
		}
		if (state!=null) {
			state.displayDetails();
		}
		else {
			System.out.println("state is null");
		}
		if (country!=null) {
			country.displayDetails();
		}
		else {
			System.out.println("country is null");
		}
		System.out.println(this.street);
		System.out.println(this.no);
	}
	
	
	

}

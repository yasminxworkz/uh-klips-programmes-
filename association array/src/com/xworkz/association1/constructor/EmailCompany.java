package com.xworkz.association1.constructor;

public class EmailCompany {
	EmailLocation location = new EmailLocation();

	public void display(String name, String ownerName) {
		
		System.out.println("====printing email company address====");

		System.out.println(" copmany name: " + name);
		System.out.println(" copmany ownerName: " + ownerName);

		location.dislpay(46, "Mountain view");

	}

}

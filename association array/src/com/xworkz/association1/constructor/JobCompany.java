package com.xworkz.association1.constructor;

public class JobCompany {
	JobLocation location = new JobLocation();

	public void display(String name, String ownerName) {
		
		System.out.println("====printing company address====");

		System.out.println(" copmany name: " + name);
		System.out.println(" copmany ownerName: " + ownerName);

		location.dislpay(28, "RajKumar road,3rd stage ");

	}

}

package com.xworkz.taskToday.boot;

import com.xworkz.taskToday.constructor.Passport;

public class PassportRunner {

	public static void main(String[] args) {
		Passport passport=new Passport(8526785);
		System.out.println("invoking the parameterized constructor with different parameters");
		System.out.println("number: "+ passport.number);
		System.out.println("name: "+ passport.name);
		System.out.println("issuedDate: "+ passport.issuedDate);
		System.out.println("expiryDate: "+ passport.expiryDate);
		System.out.println("country: "+ passport.country);
		System.out.println("noOfLeaves: "+ passport.noOfLeaves);
		
		passport=new Passport("Haji");
		System.out.println("invoking the parameterized constructor with different parameters");
		System.out.println("number: "+ passport.number);
		System.out.println("name: "+ passport.name);
		System.out.println("issuedDate: "+ passport.issuedDate);
		System.out.println("expiryDate: "+ passport.expiryDate);
		System.out.println("country: "+ passport.country);
		System.out.println("noOfLeaves: "+ passport.noOfLeaves);


		
		passport=new Passport(8526785,"Furqan");
		System.out.println("invoking the parameterized constructor with different parameters");
		System.out.println("number: "+ passport.number);
		System.out.println("name: "+ passport.name);
		System.out.println("issuedDate: "+ passport.issuedDate);
		System.out.println("expiryDate: "+ passport.expiryDate);
		System.out.println("country: "+ passport.country);
		System.out.println("noOfLeaves: "+ passport.noOfLeaves);

		
		passport=new Passport("Ayaz",28);
		System.out.println("invoking the parameterized constructor with different parameters");
		System.out.println("number: "+ passport.number);
		System.out.println("name: "+ passport.name);
		System.out.println("issuedDate: "+ passport.issuedDate);
		System.out.println("expiryDate: "+ passport.expiryDate);
		System.out.println("country: "+ passport.country);
		System.out.println("noOfLeaves: "+ passport.noOfLeaves);

		passport=new Passport("India",2010,2020);
		System.out.println("invoking the parameterized constructor with different parameters");
		System.out.println("number: "+ passport.number);
		System.out.println("name: "+ passport.name);
		System.out.println("issuedDate: "+ passport.issuedDate);
		System.out.println("expiryDate: "+ passport.expiryDate);
		System.out.println("country: "+ passport.country);
		System.out.println("noOfLeaves: "+ passport.noOfLeaves);

		
		passport=new Passport(2035,2025,"Turkey");
		System.out.println("invoking the parameterized constructor with different parameters");
		System.out.println("number: "+ passport.number);
		System.out.println("name: "+ passport.name);
		System.out.println("issuedDate: "+ passport.issuedDate);
		System.out.println("expiryDate: "+ passport.expiryDate);
		System.out.println("country: "+ passport.country);
		System.out.println("noOfLeaves: "+ passport.noOfLeaves);

		
		passport=new Passport(2045,2035);
		System.out.println("invoking the parameterized constructor with different parameters");
		System.out.println("number: "+ passport.number);
		System.out.println("name: "+ passport.name);
		System.out.println("issuedDate: "+ passport.issuedDate);
		System.out.println("expiryDate: "+ passport.expiryDate);
		System.out.println("country: "+ passport.country);
		System.out.println("noOfLeaves: "+ passport.noOfLeaves);

		
		passport=new Passport(654897,"Haji",2028,"India",2018,36);
		System.out.println("invoking the parameterized constructor with different parameters");
		System.out.println("number: "+ passport.number);
		System.out.println("name: "+ passport.name);
		System.out.println("issuedDate: "+ passport.issuedDate);
		System.out.println("expiryDate: "+ passport.expiryDate);
		System.out.println("country: "+ passport.country);
		System.out.println("noOfLeaves: "+ passport.noOfLeaves);


	}

	}



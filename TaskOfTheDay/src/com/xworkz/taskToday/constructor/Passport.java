package com.xworkz.taskToday.constructor;

public class Passport {
	public int number;
	public String name;
	public int expiryDate;
	public String country;
	public int issuedDate;
	public int noOfLeaves;

	public Passport(int number) {
		this.number = number;
	}

	public Passport(String name) {
		this.name = name;
	}

	public Passport(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public Passport(String name, int noOfLeaves) {
		this.name = name;
		this.noOfLeaves = noOfLeaves;
	}
	

	public Passport(String country, int expiryDate, int issuedDate) {
		this.country = country;
		this.expiryDate = expiryDate;
		this.issuedDate = issuedDate;

	}
	

	public Passport(int expiryDate, int issuedDate,String country) {
		this.expiryDate = expiryDate;
		this.issuedDate = issuedDate;

	}
	
	
	
	public Passport(int expiryDate, int issuedDate) {
		this.expiryDate = expiryDate;
		this.issuedDate = issuedDate;

	}
	
	
	public Passport(int number, String name, int expiryDate,String country,int issuedDate ,int noOfLeaves) {
		this.number = number;
		this.name = name;
		this.expiryDate = expiryDate;
		this.country = country;
		this.issuedDate = issuedDate;
		this.noOfLeaves = noOfLeaves;

	}


}

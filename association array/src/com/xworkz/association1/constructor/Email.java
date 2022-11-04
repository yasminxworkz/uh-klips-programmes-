package com.xworkz.association1.constructor;

public class Email {
	String id;
	String password;
	long mobileNo;
	public Email(String id, String password, long mobileNo)
	{
		this.id=id;
		this.password=password;
		this.mobileNo=mobileNo;
	}

	public void display() {
		System.out.println(" persons email id : " + id);
		System.out.println(" email password : " + password);
		System.out.println(" mobile number : " + mobileNo);
		

	}

}

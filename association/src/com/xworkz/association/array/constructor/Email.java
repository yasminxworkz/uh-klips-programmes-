package com.xworkz.association.array.constructor;

public class Email {
	
	public String id;
	public long password;
	public long mobileNo;
	public EmailCompany company;
	
	
	public void setEmail(String id,long password,long mobileNo) {
		this.id=id;
		this.password=password;
		this.mobileNo=mobileNo;

		
	}
	
	public void setEmailCompany (EmailCompany company) {
		company=company;
	}
	public void displayDetails() {
		System.out.println(this.id);
		System.out.println(this.password);
		System.out.println(mobileNo);
		System.out.println(company);
		
	}
	
	

}

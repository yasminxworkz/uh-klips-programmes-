package com.xworkz.association1.constructor;

public class Email {
	public String id;
	public String password;
	public long mobileNo;
	public EmailCompany ecompany;
	
	public Email(String id, String password, long mobileNo)
	{
		this.id=id;
		this.password=password;
		this.mobileNo=mobileNo;
	}
	
	public void setEcompany(EmailCompany ecompany) {
		this.ecompany=ecompany;
	}
	

	public void display() {
		System.out.println(" persons email id : " + id);
		System.out.println(" email password : " + password);
		System.out.println(" mobile number : " + mobileNo);
		ecompany.display();

	}

}

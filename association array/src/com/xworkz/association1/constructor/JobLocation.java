package com.xworkz.association1.constructor;

public class JobLocation {
	public int no;
	public String street;
	JobCity jCity;
	JobState jState;
	JobCountry jCountry;
	
	public JobLocation(int no, String street) {
		this.no=no;
		this.street=street;
	}
	
	public void setJobCity(JobCity jCity) {
		this.jCity=jCity;
	}
	
	public void setJobState(JobState jState) {
		this.jState=jState;
	}
	
	public void setJobCountry(JobCountry jCountry) {
		this.jCountry=jCountry;
	}
	

	public void dislpay() {

		System.out.println(" office number : " + no);
		System.out.println(" office street : " + street);
       jCity.display();
       jState.display();
       jCountry.display();

	}

}

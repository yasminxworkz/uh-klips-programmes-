package com.xworkz.association1.constructor;

public class Job {
	
	public int salary;
	public String role;
	public Boolean bond;
	JobCompany company;
	
	public Job(int salary, String role, Boolean bond) {
		this.salary=salary;
		this.role=role;
		this.bond=bond;
	}
	
	public void setCompany(JobCompany company) {
		this. company=company;
	}
	public void display() {
		System.out.println("====printing job details====");
		System.out.println(" salary : " + salary);
		System.out.println(" role : " + role);
		System.out.println(" bond : " + bond);
		company.display();
		
		
		

	}

}

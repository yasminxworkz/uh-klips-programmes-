package com.xworkz.association.array.constructor;

public class Job {
	public String role;
	public int bond=5;
	public int salary;
	public JobCompany company=new JobCompany();
	
	public Job(String role,int salary) {
		this.role=role;
		this.salary=salary;
	}
	
	
	public void displayDetails() {
		if (company!=null) {
			company.displayDetails();
		}
		else {
			System.out.println("company is null");
		}
		System.out.println(this.role);
		System.out.println(this.salary);
		System.out.println(bond);
	}

}

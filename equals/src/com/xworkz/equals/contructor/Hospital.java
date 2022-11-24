package com.xworkz.equals.contructor;

public class Hospital {
	private String name;
	private String location;
	private String type;
	private String dressCode;
	private int noOfDoctors;
	private int noOfNurses;
	private int fees;
	private int workingHours;
	private long salaryOfWorkers;
	private boolean open;
	
	public Hospital(String name, String location, String type, String dressCode, int noOfDoctors, int noOfNurses,
			int fees, int workingHours, long salaryOfWorkers, boolean open) {
		super();
		this.name = name;
		this.location = location;
		this.type = type;
		this.dressCode = dressCode;
		this.noOfDoctors = noOfDoctors;
		this.noOfNurses = noOfNurses;
		this.fees = fees;
		this.workingHours = workingHours;
		this.salaryOfWorkers = salaryOfWorkers;
		this.open = open;
	}
	
	

	@Override
	public String toString() {
		return "Hospital [name=" + name + ", location=" + location + ", type=" + type + ", dressCode=" + dressCode
				+ ", noOfDoctors=" + noOfDoctors + ", noOfNurses=" + noOfNurses + ", fees=" + fees + ", workingHours="
				+ workingHours + ", salaryOfWorkers=" + salaryOfWorkers + ", open=" + open + "]";
	}
	
public boolean equals(Object patient) {
		
		if(patient instanceof Hospital) {
			Hospital casted=(Hospital)patient;
			
			if(this.name.equals(casted.name) && this.location.equals(casted.location) && this.noOfNurses==casted.noOfNurses && this.dressCode.equals(casted.dressCode) && this.open==casted.open && this.salaryOfWorkers==casted.salaryOfWorkers) {
				System.out.println("properties are equall");
				return true;
			}
		
		else {
			System.out.println("properties are not equal");
		}
		
		
	}
	return false;
	
	
}
}

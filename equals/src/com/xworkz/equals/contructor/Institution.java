package com.xworkz.equals.contructor;

public class Institution {
	private String name;
	private String location;
	private String type;
	private int noOfStaff;
	private int workingHours;
	private long salaryOfWorkers;
	private int fees;
	private int noOfFloors;
	private long noOfStudents;
	private  boolean open;
	
	public Institution(String name, String location, String type, int noOfStaff, int workingHours, long salaryOfWorkers,
			int fees, int noOfFloors, long noOfStudents, boolean open) {
		super();
		this.name = name;
		this.location = location;
		this.type = type;
		this.noOfStaff = noOfStaff;
		this.workingHours = workingHours;
		this.salaryOfWorkers = salaryOfWorkers;
		this.fees = fees;
		this.noOfFloors = noOfFloors;
		this.noOfStudents = noOfStudents;
		this.open = open;
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public int getNoOfStaff() {
		return noOfStaff;
	}



	public void setNoOfStaff(int noOfStaff) {
		this.noOfStaff = noOfStaff;
	}



	public int getWorkingHours() {
		return workingHours;
	}



	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}



	public long getSalaryOfWorkers() {
		return salaryOfWorkers;
	}



	public void setSalaryOfWorkers(long salaryOfWorkers) {
		this.salaryOfWorkers = salaryOfWorkers;
	}



	public int getFees() {
		return fees;
	}



	public void setFees(int fees) {
		this.fees = fees;
	}



	public int getNoOfFloors() {
		return noOfFloors;
	}



	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}



	public long getNoOfStudents() {
		return noOfStudents;
	}



	public void setNoOfStudents(long noOfStudents) {
		this.noOfStudents = noOfStudents;
	}



	public boolean isOpen() {
		return open;
	}



	public void setOpen(boolean open) {
		this.open = open;
	}



	@Override
	public String toString() {
		return "Institution [name=" + name + ", location=" + location + ", type=" + type + ", noOfStaff=" + noOfStaff
				+ ", workingHours=" + workingHours + ", salaryOfWorkers=" + salaryOfWorkers + ", fees=" + fees
				+ ", noOfFloors=" + noOfFloors + ", noOfStudents=" + noOfStudents + ", open=" + open + "]";
	}
	
public boolean equals(Object bank) {
		
		if(bank instanceof Institution) {
			Institution casted=(Institution)bank;
			
			if(this.name.equals(casted.name) && this.workingHours==casted.workingHours && this.salaryOfWorkers==casted.salaryOfWorkers && this.location.equals(casted.location) && this.type.equals(casted.type)) {
				System.out.println("properties are equal");
				return true;
			}
		
		else {
			System.out.println("properties are not equal");
		}
		
		
	}
	return false;
	
	
}

}

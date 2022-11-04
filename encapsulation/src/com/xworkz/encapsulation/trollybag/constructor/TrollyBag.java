package com.xworkz.encapsulation.trollybag.constructor;

public class TrollyBag {
	String color="red";
	int noOfWheels=4;
	int price=25000;
	boolean easyToHandle=true;
	String brand;
	String bagMaterial;
	String brandAmbassador;
	private long bagCompanyRevenue;
	private String companyOwner;
	private String manufacturedAt;
	private double weightLimit;
	private String type;
	private int noOfCompartments;
	
	public long getbagCompanyRevenue(){
		return bagCompanyRevenue;
	}
	
	void setbagCompanyRevenue(long bagCompanyRevenue) {
		this.bagCompanyRevenue=bagCompanyRevenue;
	}
	
	public String getCompanyOwner() {
		return companyOwner;
	}
	
	void setCompanyOwner(String companyOwner) {
		this.companyOwner=companyOwner;
	}
	
	public String getManufacturedAt() {
		return manufacturedAt;
	}
	
	void setManufacturedAt(String manufacturedAt) {
		this.manufacturedAt=manufacturedAt;
	}
	
	public double getweightLimit() {
		return weightLimit;
	}
	
	void setweightLimit(double weightLimit) {
		this.weightLimit=weightLimit;
	}
	
	
	public String gettype() {
		return type;
	}
	
	void settype(String type) {
		this.type=type;
	}
	
	public int getnoOfCompartments() {
		return noOfCompartments;
	}
	
	void setnoOfCompartments(int noOfCompartments) {
		this.noOfCompartments=noOfCompartments;
	}
	

}

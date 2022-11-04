package com.xworkz.encapsulation.lipbalm.constructor;

public class Lipbalm {
	String brand="himalaya";
	int price=120;
	String consistency="wax like";
	String type="medictaed";
	int bestBefore;
	String color;
	String packagingMaterial;
	String flavour;
	private double weight;
	private String function;
	private String manufacturedAt;
	private String companyOwner;
	private String containerShape;
	
	public double getWeight() {
		return weight;
	}
	
	void setWeight(double weight) {
		this.weight= weight;
	}
	
	public String getFunction() {
		return function;
	}
	
	void setFunction(String function) {
		this.function= function;
	}
	
	public String getManufacturedAt() {
		return manufacturedAt;
	}
	
	void setManufacturedAt(String manufacturedAt) {
		this.manufacturedAt= manufacturedAt;
	}
	
	public String getCompanyOwner() {
		return companyOwner;
	}
	
	void setCompanyOwner(String companyOwner) {
		this.companyOwner= companyOwner;
	}
	
	public String getContainerShape() {
		return containerShape;
	}
	
	void setContainerShape(String containerShape) {
		this.containerShape= containerShape;
	}
	
	

}

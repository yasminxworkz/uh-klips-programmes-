package com.xworkz.encapsulation.shoe.constructor;

public class Shoe {
	String brand;
	double size;
	String type;
	String shoeCompanyLocation;
	
	boolean famous=true;
	String brandAmbassador="Harrdy Sandhu";
	long shoeCompanyRevenue=12155555555l;
	
	private String material;
	private String color;
	private String owner;
	private boolean comfort;
	private int price;
	private int validity;
	
	public String getMaterial(){
		return material;
	}
	
	void setMaterial(String material) {
		this.material=material;
	}
	
	public String getColor() {
		return color;
	}
	
	void setColor(String color) {
		this.color=color;
	}
	
	public String getOwner() {
		return owner;
	}
	
	void setOwner(String owner) {
		this.owner=owner;
	}
	
	public int getPrice() {
		return price;
	}
	
	void setPrice(int price) {
		this.price=price;
	}
	
	public int getValidity() {
		return validity;
	}
	
	void setValidity(int validity) {
		this.validity=validity;
	}
	
	public boolean isComfort() {
		return comfort;
	}
	
	void setComfort(boolean comfort) {
		this.comfort=comfort;
	}
	
	
	
	
	
	

}

package com.xworkz.encapsulation.house.constructor;

public class House {
	int size;
	String houseName;
	String area;
	int houseNo;
	String type;
	String paint;
	String floor;
	boolean wellFurnished;
	int noOfMembers;
	private String houseOwner;
	private String houseShape;
	private int houseRent;
	private String houseDesigner;
	
	public String getHouseOwner(){
	      return houseOwner;
	}
	
	void setHouseOwner(String houseOwner) {
		this.houseOwner=houseOwner;
	}
	
	public String getHouseShape(){
	      return houseShape;
	}
	
	void setHouseShape(String houseShape) {
		this.houseShape=houseShape;
	}
	
	public int getHouseRent(){
	      return houseRent;
	}
	
	void setHouseRent(int houseRent) {
		this.houseRent=houseRent;
	}
	
	public String getHouseDesigner(){
	      return houseDesigner;
	}
	
	void setHouseDesigner(String houseDesigner) {
		this.houseDesigner=houseDesigner;
	}

}

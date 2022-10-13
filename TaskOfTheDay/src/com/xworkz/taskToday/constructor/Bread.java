package com.xworkz.taskToday.constructor;

public class Bread {
	public String type;
	public String shape;
	public double price;
	public int quantity;
	public String companyName;
	
	public Bread(String type) {
		this.type=type;
	}
	
	public Bread(double price) {
		this.price=price;
	} 
	
	public Bread(int quantity,double price) {
		this.quantity=quantity;
		this.price=price;

	} 
	
	public Bread(int quantity,String companyName) {
		this.quantity=quantity;
		this.companyName=companyName;
	} 
	
	public Bread(String companyName,int quantity) {
		this.quantity=quantity;
		this.companyName=companyName;

	} 
	
	public Bread(String companyName,int quantity,double price) {
		this.quantity=quantity;
		this.companyName=companyName;
		this.price=price;


	} 
	
	public Bread(double price,int quantity) {
		this.quantity=quantity;
	} 
	
	public Bread(String type,String shape,int quantity,double price,String companyName) {
		this.type=type;
		this.shape=shape;
		this.quantity=quantity;
		this.price=price;
		this.companyName=companyName;


	} 
	

}

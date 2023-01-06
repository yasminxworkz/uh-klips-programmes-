package com.xworkz.alltopics.association.things;

public class Ponds {
	
	public String manufacturedAt;
	public String Owner;
	public int noOfProducts;
	
	public void details(String manufacturedAt,String Owner, int noOfProducts) {
		this.manufacturedAt=manufacturedAt;
		this.Owner=Owner;
		this.noOfProducts=noOfProducts;
	}
	
	public void display() {
		System.out.println(manufacturedAt);
		System.out.println(noOfProducts);
		System.out.println(Owner);
	}

}

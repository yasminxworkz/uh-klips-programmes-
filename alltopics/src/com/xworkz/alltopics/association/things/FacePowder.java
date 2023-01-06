package com.xworkz.alltopics.association.things;

public class FacePowder {
	
	public String name;
	public int price;
	public double qty;
	public Ponds ponds;
	
	public void display(String name,int price,double qty) {
		this.name=name;
		this.price=price;
		this.qty=qty;
	}
	
	public void associatedClass(Ponds ponds) {
		this.ponds=ponds;
	}
	
	public void readValues() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(qty);
		ponds.display();
	}

}

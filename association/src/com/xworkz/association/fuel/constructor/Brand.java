package com.xworkz.association.fuel.constructor;

public class Brand {
	
	
	public String name;
	public String gstNo="29AAACB2902M1ZP";
	public String rating="CRISILA1+";
	public BrandLocation location=new BrandLocation("mumbai",400029);
	
	public Brand(String name) {
		this.name=name;
		
	}
	
	public void showOff() {
		System.out.println("********************Brand Details************************");
		System.out.println("Brandname: "+this.name);
		System.out.println("gstNo.: "+this.gstNo);
		System.out.println("rating: "+rating);
		location.showOff();
		
	}

}

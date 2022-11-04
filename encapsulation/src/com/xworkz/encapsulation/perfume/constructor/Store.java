package com.xworkz.encapsulation.perfume.constructor;

public class Store {
	public String name="more";
	Perfume perfume=new Perfume();
	
	
	public void setPerfume() {
		perfume.fragrance="jasmine";
		perfume.price=98;
	}
	
	
	
	
		

	
	public void use() {
		System.out.println(this.name);
		perfume.setBrand("Scuba");
		System.out.println(perfume.getBrand());
		System.out.println(this.perfume.fragrance);
		System.out.println(this.perfume.price);
		
		
	}

}

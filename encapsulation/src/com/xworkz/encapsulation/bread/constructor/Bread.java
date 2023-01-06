package com.xworkz.encapsulation.bread.constructor;

public class Bread {
	String shape="square";
	double quantity=250.5d;
	String shopName="warrior";
	String type="multigrain";
	int price;
	String madeUpOf;
	String color;
	String flavor;
	boolean goodQuality;
	private String breadSweet;
	private String packagingMaterial;
	private String brand;
	private String brandAmbassador;
	
	
	public String getBreadSweet() {
		return breadSweet;
	}
	
	void setBreadSweet(String breadSweet) {
		this.breadSweet=breadSweet;
	}
	
	public String getPackagingMaterial() {
		return packagingMaterial;
	}
	
	void setPackagingMaterial(String packagingMaterial) {
		this.packagingMaterial=packagingMaterial;
	}
	
	public String getBrand() {
		return brand;
	}
	
	void setBrand(String brand) {
		this.brand=brand;
	}
	
	public String getBrandAmbassador() {
		return brandAmbassador;
	}
	
	void setBrandAmbassador(String brandAmbassador) {
		this.brandAmbassador=brandAmbassador;
	}
	
	
	

}

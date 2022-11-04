package com.xworkz.association.array.constructor;

public class JCity {
	public String name;
	public boolean capital;
	public int pincode;
	public String districtCommissioner;
	
	public JCity(String name,boolean capital) {
		this.name=name;
		this.capital=capital;
		}
	
	public void setCityProperties(int pincode,String districtCommissioner) {
		this.pincode=pincode;
		this.districtCommissioner=districtCommissioner;
		}
	
	public void displayDetails() {
		System.out.println(this.name);
		System.out.println(this.capital);
		System.out.println(this.pincode);
		System.out.println(this.districtCommissioner);

}
}

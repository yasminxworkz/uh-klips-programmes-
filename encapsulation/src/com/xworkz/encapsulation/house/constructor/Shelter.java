package com.xworkz.encapsulation.house.constructor;

public class Shelter {
	House ghar=new House();
	
	public void setHouse() {
		ghar.size=2000;
		ghar.houseName="khazi manzil";
		ghar.area="JCNagar";
		ghar.houseNo=25;
		ghar.type="double floor";
	}
		
		public void use() {
		
		System.out.println("size: "+this.ghar.size);
		System.out.println("houseName: "+this.ghar.houseName);
		System.out.println("area: "+this.ghar.area);
		System.out.println("houseNo: "+this.ghar.houseNo);
		System.out.println("type: "+this.ghar.type);
		
		System.out.println("paint: "+ghar.paint);
		System.out.println("floor: "+ghar.floor);
		System.out.println("wellFurnished: "+ghar.wellFurnished);
		System.out.println("noOfMembers: "+ghar.noOfMembers);
		
		ghar.setHouseDesigner("farhat");
		System.out.println("HouseDesigner: "+ghar.getHouseDesigner());
		
		ghar.setHouseOwner("moeen");
		System.out.println("HouseOwner: "+ghar.getHouseOwner());
		
		ghar.setHouseRent(30000);
		System.out.println("HouseRent: "+ghar.getHouseRent());
		
		ghar.setHouseShape("square");
		System.out.println("HouseShape: "+ghar.getHouseShape());
		
		
		
		
	}

}

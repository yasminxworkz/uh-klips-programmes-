package com.xworkz.encapsulation.shoe.constructor;

public class ShoeShop {
	
	public String shopName="renuka";
	Shoe shoe=new Shoe();
	
	public void setShoe() {
		shoe.brand="puma";
		shoe.size=6.0d;
		shoe.type="sports";
		shoe.shoeCompanyLocation="bangalore";				
	}
	
	public void use(){
		System.out.println("shopName :"+shopName);
		System.out.println("shoe brand :"+this.shoe.brand);
		System.out.println("shoe size :"+this.shoe.size);
		System.out.println("shoe type :"+this.shoe.type);
		System.out.println("shoe shoeCompanyLocation :"+this.shoe.shoeCompanyLocation);
		
		System.out.println("shoe famous :"+shoe.famous);
		System.out.println("shoe brandAmbassador :"+shoe.brandAmbassador);
		System.out.println("shoe shoeCompanyRevenue :"+shoe.shoeCompanyRevenue);
		System.out.println("*****************private access specifier************");
		shoe.setMaterial("blown rubber");
		System.out.println(shoe.getMaterial());
		shoe.setColor("white");
		System.out.println(shoe.getColor());
		shoe.setOwner("robin");
		System.out.println(shoe.getOwner());
		shoe.setPrice(8000);
		System.out.println(shoe.getPrice());
		shoe.setValidity(8);
		System.out.println(shoe.getValidity());
		shoe.setComfort(true);
		System.out.println(shoe.isComfort());
		
		
		
		
		}
	

}

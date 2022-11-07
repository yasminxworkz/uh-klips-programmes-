package com.xworkz.encapsulation.bread.constructor;

public class Bakery {
	Bread bread=new Bread();
	
	public void setBread() {
		bread.color="offwhite";
		bread.flavor="vanilla";
		bread.goodQuality=true;
		bread.madeUpOf="maida";
		bread.price=50;
	}
	
	public void use() {
		System.out.println("============default access specifier==========");

		System.out.println("color :"+this.bread.color);
		System.out.println("flavor :"+this.bread.flavor);
		System.out.println("goodQuality :"+this.bread.goodQuality);
		System.out.println("madeUpOf :"+this.bread.madeUpOf);
		System.out.println("price :"+this.bread.price);
		
		System.out.println("shopName: "+bread.shopName);
		System.out.println("quantity: "+bread.quantity);
		System.out.println("shape: "+bread.shape);
		System.out.println("type: "+bread.type);
		System.out.println("============private access specifier==========");

		bread.setBrand("BigBread");
		System.out.println("Brand: "+bread.getBrand());
		
		bread.setBrandAmbassador("kareena");
		System.out.println("BrandAmbassador: "+bread.getBrandAmbassador());
		
		bread.setBreadSweet("bread halwa");
		System.out.println("BreadSweet: "+bread.getBreadSweet());
		
		bread.setPackagingMaterial("LDPE bags");
		System.out.println("PackagingMaterial: "+bread.getPackagingMaterial());
		
	}

}

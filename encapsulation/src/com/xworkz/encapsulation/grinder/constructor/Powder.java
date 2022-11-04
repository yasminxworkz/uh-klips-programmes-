package com.xworkz.encapsulation.grinder.constructor;

public class Powder {
	Grinder blend=new Grinder();
	
	public void setGrinder() {
		blend.brand="philips";
		blend.price=8000;
		blend.motorHP=6.5d;
		blend.noOfJars=3;
		blend.type="spiral";
	}
	
	public void use() {
		System.out.println("============default access specifier==========");
		System.out.println("brand: "+this.blend.brand);
		System.out.println("price: "+this.blend.price);
		System.out.println("motorHP: "+this.blend.motorHP);
		System.out.println("noOfJars: "+this.blend.noOfJars);
		System.out.println("type: "+this.blend.type);
		System.out.println("brandAmbassador: "+blend.brandAmbassador);
		System.out.println("shape: "+blend.shape);
		System.out.println("============private access specifier==========");
		blend.setColor("blue");
		System.out.println("color: "+blend.getColor());
		
		blend.setFunction("blending");
		System.out.println("function: "+blend.getFunction());
		
		blend.setOwner("namrata");
		System.out.println("owner: "+blend.getOwner());
		
		blend.setManufacturedAt("hubli");
		System.out.println("manufacturedAt: "+blend.getManufacturedAt());
		
	}

}

package com.xworkz.encapsulation.lipbalm.constructor;

public class Moisturizer {
	Lipbalm lip=new Lipbalm();
	
	public void setLipbalm() {
		lip.bestBefore=6;
		lip.color="pink";
		lip.flavour="Lipbalm";
		lip.packagingMaterial="glass";
	
	}
	
	public void use() {
		System.out.println("bestBefore :"+this.lip.bestBefore);
		System.out.println("color :"+this.lip.color);
		System.out.println("flavour:"+this.lip.flavour);
		System.out.println("packagingMaterial :"+this.lip.packagingMaterial);
		System.out.println(lip.consistency);
		System.out.println(lip.brand);
		System.out.println(lip.price);
		System.out.println(lip.type);
		lip.setCompanyOwner("muhammad manal");
		System.out.println(lip.getCompanyOwner());
		lip .setContainerShape("cylindrical");
		System.out.println(lip.getContainerShape());
		lip.setFunction("healing lips");
		System.out.println(lip.getFunction());
		lip.setManufacturedAt("bangalore");
		System.out.println(lip.getManufacturedAt());
		lip.setWeight(100);
		System.out.println(lip.getWeight());
		
		
		
		
	}

}

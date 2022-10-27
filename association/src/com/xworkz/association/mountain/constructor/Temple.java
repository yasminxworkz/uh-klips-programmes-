package com.xworkz.association.mountain.constructor;

public class Temple {
	
	public String name;
	public String mainPriest;
	public int noOfVisitors;
	public int collectionPerDay;
	public God god=new God("Shiva","male",true);
	
	public Temple(String name,String mainPriest,int noOfVisitors,int collectionPerDay) {
		this.name=name;
		this.mainPriest=mainPriest;
		this.noOfVisitors= noOfVisitors;
		this.collectionPerDay=collectionPerDay;
		
	}
	
	
	
	public void showOff() {
		System.out.println("======printng details of temple====");
		System.out.println(this.name);
		System.out.println(this.mainPriest);
		System.out.println(this.noOfVisitors);
		System.out.println(this.collectionPerDay);
		god.showOff();
		
	}

}

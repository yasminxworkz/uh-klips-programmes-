package com.xworkz.encapsulation.goa.constructor;

public class Beach {
	Goa goa=new Goa();
	
	public void setGoa() {
		goa.state="goa";
		goa.noOfBeach=5;
		goa.ticketPrice=800;
	}
	
	public void use() {
		System.out.println("============default access specifier==========");

		System.out.println("goa state :"+this.goa.state);
		System.out.println("goa noOfBeach :"+this.goa.noOfBeach);
		System.out.println("goa ticketPrice :"+this.goa.ticketPrice);
		
		System.out.println("goa touristPlace :"+goa.touristPlace);
		System.out.println("goa distancefromgadag :"+goa.distancefromgadag);
		System.out.println("goa timeToReach :"+goa.timeToReach);
		System.out.println("goa famousFor :"+goa.famousFor);
		System.out.println("*****************private access specifier************");
		goa.setTemp(26.5d);
		System.out.println(goa.getTemp());
		goa.setCountry("India");
		System.out.println(goa.getCountry());
		goa.setChiefMinister("pramod");
		System.out.println(goa.getChiefMinister());
		goa.setNoOfTouristsPerDay(10000);
		System.out.println(goa.getNoOfTouristsPerDay());
		goa.setFamousDrink("feni");
		System.out.println(goa.getFamousDrink());
		goa.setPopulation(1800000l);
		System.out.println(goa.getPopulation());
		
		
		
		
		
		}
	}



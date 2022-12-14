package com.xworkz.encapsulation.vehicle.constructor;

public class Travel {
	Vehicle trip=new Vehicle();
	
	public void setVehicle() {
		trip.type="TT";
		trip.owner="safaTT";
		trip.capacity=15;
		trip.size="medium";
	}
	
	public void use() {
		System.out.println("============default access specifier==========");
		System.out.println("type: "+this.trip.type);
		System.out.println("owner: "+this.trip.owner);
		System.out.println("capacity: "+this.trip.capacity);
		System.out.println("size: "+this.trip.size);
		System.out.println("travellingDistance: "+trip.travellingDistance);
		System.out.println("fuelType: "+trip.fuelType);
		System.out.println("engineDisplacement: "+trip.engineDisplacement);
		System.out.println("maxPower: "+trip.maxPower);
		System.out.println("============private access specifier==========");
		trip.setRent(18000);
		System.out.println("rent: "+trip.getRent());
		
		trip.setDeparturePlace("gadag");
		System.out.println("departurePlace: "+trip.getDeparturePlace());
		
		trip.setDestination("dandeli");
		System.out.println("destination: "+trip.getDestination());
		
	}

}

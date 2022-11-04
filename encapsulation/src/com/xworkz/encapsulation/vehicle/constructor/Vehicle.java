package com.xworkz.encapsulation.vehicle.constructor;

public class Vehicle {
	String type;
	String owner;
	int capacity;
	String size;
	int travellingDistance=5;
	String fuelType= "Diesel";
	int engineDisplacement=2596;
	int maxPower=58;
	private int rent;
	private String departurePlace;
	private String destination;
	
	public int getRent() {
		return rent;
	}
	
	void setRent(int rent) {
		this.rent=rent;
	}
	
	public String getDeparturePlace() {
		return departurePlace;
	}
	
	void setDeparturePlace(String departurePlace) {
		this.departurePlace=departurePlace;
	}
	
	public String getDestination() {
		return destination;
	}
	
	void setDestination(String destination) {
		this.destination=destination;
	}
	

}

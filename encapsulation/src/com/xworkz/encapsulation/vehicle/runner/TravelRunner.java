package com.xworkz.encapsulation.vehicle.runner;

import com.xworkz.encapsulation.vehicle.constructor.Travel;
import com.xworkz.encapsulation.vehicle.constructor.Vehicle;

public class TravelRunner {

	public static void main(String[] args) {
		
		Vehicle trip=new Vehicle();
		Travel tour=new Travel();
		tour.setVehicle();
		trip.getDeparturePlace();
		trip.getDestination();
		trip.getRent();
		tour.use();

	}

}

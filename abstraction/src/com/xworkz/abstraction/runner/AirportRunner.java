package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.constructor.*;

public class AirportRunner {

	public static void main(String[] args) {
		AirPortRules flight=new PassengerRules();
		Airport airlines=new Airport(flight);
		airlines.checkRules();

	}

}

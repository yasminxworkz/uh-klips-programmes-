package com.xworkz.inheritance.satellite.runner;

import com.xworkz.inheritance.satellite.constructor.Moon;
import com.xworkz.inheritance.satellite.constructor.Satellite;

public class SatelliteRunner {

	public static void main(String[] args) {
		Satellite sat=new Moon(4, "internet Communications", true);
		sat.display();

	}

}

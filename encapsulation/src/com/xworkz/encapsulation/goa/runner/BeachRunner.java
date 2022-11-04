package com.xworkz.encapsulation.goa.runner;

import com.xworkz.encapsulation.goa.constructor.Beach;
import com.xworkz.encapsulation.goa.constructor.Goa;

public class BeachRunner {

	public static void main(String[] args) {
		Goa goa=new Goa();
		Beach beach=new Beach();
		beach.setGoa();
		goa.getchiefMinister();
		goa.getCountry();
		goa.getfamousDrink();
		goa.getnoOfTouristsPerDay();
		goa.getpopulation();
		goa.getTemp();
		beach.use();

	}

}

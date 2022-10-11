package com.xworkz.tasktoday.boot;

import com.xworkz.tasktoday.constructor.*;

public class BusInfoRunner {

	public static void main(String[] args) {
		
		BusInfo bus1=new BusInfo();
	System.out.println(bus1.number);
	System.out.println(bus1.startingpt);
	System.out.println(bus1.destination);
	
	bus1.number=89;
	bus1.startingpt="kaverinagar";
	bus1.destination="navarang";
	System.out.println(bus1.number);
	System.out.println(bus1.startingpt);
	System.out.println(bus1.destination);
	
	
		

	}

}

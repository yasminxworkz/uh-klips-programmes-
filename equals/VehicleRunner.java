package com.xworkz.equals.runner;

import com.xworkz.equals.contructor.Vehicle;

public class VehicleRunner {

	public static void main(String[] args) {
		Vehicle gaadi = new Vehicle("KTM", "bike", "red","delhi", 2018,35,150,200000,true,false);
		System.out.println(gaadi);
		
		Vehicle gaadi1 = new Vehicle("KTM", "car", "blue","hubli",2016,40,200,150000,false,true);
		System.out.println(gaadi1);
        
	   
		boolean race = gaadi.equals(gaadi1);
		System.out.println(race);
	}

}

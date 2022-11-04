package com.xworkz.encapsulation.house.runner;

import com.xworkz.encapsulation.house.constructor.House;
import com.xworkz.encapsulation.house.constructor.Shelter;

public class ShelterRunner {

	public static void main(String[] args) {
		House ghar=new House();
		Shelter shelter=new Shelter();
		shelter.setHouse();
		ghar.getHouseDesigner();
		ghar.getHouseOwner();
		ghar.getHouseRent();
		ghar.getHouseShape();
		shelter.use();
		
		

	}

}

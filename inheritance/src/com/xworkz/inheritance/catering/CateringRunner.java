package com.xworkz.inheritance.catering;

import com.xworkz.inheritance.catering.constructor.Catering;

public class CateringRunner {

	public static void main(String[] args) {
		Catering hotel=new Catering(25, "marriage", "gadag");
		System.out.println(hotel.teamMembers);
		System.out.println(hotel.typeOfEvent);
		System.out.println(hotel.location);
		

	}

}

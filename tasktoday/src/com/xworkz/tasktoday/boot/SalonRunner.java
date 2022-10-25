package com.xworkz.tasktoday.boot;

import com.xworkz.tasktoday.constructor.Salon;

public class SalonRunner {

	public static void main(String[] args) {
		Salon handsome=new Salon("loreal");
		handsome.acRoom=true;
		handsome.setSalonRent();
		Salon.noOfHairCutstyles=20;
		handsome.display();

	}

}

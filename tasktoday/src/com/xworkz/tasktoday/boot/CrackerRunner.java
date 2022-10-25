package com.xworkz.tasktoday.boot;

import com.xworkz.tasktoday.constructor.Cracker;

public class CrackerRunner {

	public static void main(String[] args) {
		
		Cracker phataake=new Cracker(4.0d);
		phataake.setUsedAt();
		phataake.price=950;
		Cracker.companyName="S.K";
		phataake.display();
		
				

	}

}

package com.xworkz.encapsulation.lipbalm.runner;

import com.xworkz.encapsulation.lipbalm.constructor.Lipbalm;
import com.xworkz.encapsulation.lipbalm.constructor.Moisturizer;

public class MoisturizerRunner {

	public static void main(String[] args) {
		Lipbalm lip=new Lipbalm();
		Moisturizer cure=new Moisturizer();
		cure.setLipbalm();
		lip.getCompanyOwner();
		lip.getContainerShape();
		lip.getFunction();
		lip.getManufacturedAt();
		lip.getWeight();
		cure.use();
	

	}

}

package com.xworkz.encapsulation.grinder.runner;

import com.xworkz.encapsulation.grinder.constructor.Grinder;
import com.xworkz.encapsulation.grinder.constructor.Powder;

public class PowderRunner {

	public static void main(String[] args) {
		Grinder blend=new Grinder();
		Powder powder=new Powder();
		powder.setGrinder();
		blend.getColor();
		blend.getFunction();
		blend.getOwner();
		blend.getManufacturedAt();
		powder.use();

	}

}

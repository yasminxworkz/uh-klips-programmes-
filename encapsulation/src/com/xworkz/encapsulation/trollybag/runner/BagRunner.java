package com.xworkz.encapsulation.trollybag.runner;

import com.xworkz.encapsulation.trollybag.constructor.Bag;
import com.xworkz.encapsulation.trollybag.constructor.TrollyBag;

public class BagRunner {

	public static void main(String[] args) {
		TrollyBag trolly=new TrollyBag();
		Bag bag=new Bag();
		bag.setTrollyBag();
		trolly.getbagCompanyRevenue();
		trolly.getCompanyOwner();
		trolly.getManufacturedAt();
		trolly.getnoOfCompartments();
		trolly.gettype();
		trolly.getweightLimit();
		bag.use();
		
	}

}

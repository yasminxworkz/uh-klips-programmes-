package com.xworkz.interfaces.bag.boot;

import com.xworkz.interfaces.bag.Bag;
import com.xworkz.interfaces.bag.TrollyBag;

public class TrollyBagRunner {

	public static void main(String[] args) {
		TrollyBag bags=new TrollyBag();
		bags.brand();
		bags.color();
		bags.shapes();
		bags.type();
		bags.quantity();
		bags.goodQuality();
		
		
		Bag bag=new TrollyBag();
		bag.brand();
		bag.color();
		bag.shapes();
		bag.type();
		bag.quantity();

	}

}

package com.xworkz.collections;

import java.util.Collection;
import java.util.LinkedHashSet;

public class Bikes {

	public static void main(String[] args) {
		String bike1="Yamaha MT 15 V2";
		String bike2="Royal Enfield Classic 350";
		String bike3="Royal Enfield Hunter 350";
		String bike4="Yamaha R15S";
		String bike5="Hero Splendor Plus";
		String bike6="TVS Raider";
		String bike7="TVS Apache RTR 160";
		String bike8="Royal Enfield Bullet 350";
		String bike9="Hero hf";
		String bike10="passion pro";
		String bike11="passion plus";
		String bike12="ktm";
		String bike13="ducati";
		String bike14="pulsor";
		String bike15="royalenfield";
		String bike16="activa";
		String bike17="Deo";
		String bike18="RC200";

		Collection<String> collection= new LinkedHashSet<String>();
		
		collection.add(bike18);
		collection.add(bike17);
		collection.add(bike16);
		collection.add(bike15);
		collection.add(bike14);
		collection.add(bike13);
		collection.add(bike12);
		collection.add(bike11);
		collection.add(bike10);
		collection.add(bike9);
		collection.add(bike8);
		collection.add(bike7);
		collection.add(bike6);
		collection.add(bike5);
		collection.add(bike4);
		collection.add(bike3);
		collection.add(bike2);
		collection.add(bike1);
		
		System.out.println(collection);
		System.out.println("size before clearing "+collection.size());
		
		collection.clear();
		System.out.println("size after clearing "+collection.size());
	}

}

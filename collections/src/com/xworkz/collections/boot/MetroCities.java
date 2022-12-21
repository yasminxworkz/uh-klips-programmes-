package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCities {

	public static void main(String[] args) {
		String metroCities1="Bangalore";
		String metroCities2="Kolkata";
		String metroCities3="mumbai";
		String metroCities4="Delhi";
		String metroCities5="Hyderabad";
		String metroCities6="Pune";
		String metroCities7="Jamshedhpur";
		String metroCities8="Tiruchirapalli";
		String metroCities9="Coimbatore";
		String metroCities10="Gazhiabad";
		
		
		Collection<String> collection=new ArrayList<String>();
		
		collection.add(metroCities10);
		collection.add(metroCities9);
		collection.add(metroCities8);
		collection.add(metroCities7);
		collection.add(metroCities6);
		collection.add(metroCities5);
		collection.add(metroCities4);
		collection.add(metroCities3);
		collection.add(metroCities2);
		collection.add(metroCities1);
		
		System.out.println(collection);
		
		
	
		Iterator<String> iterate=collection.iterator();
	
		while(iterate.hasNext()) {
			String soft=iterate.next();
			System.out.println("name of the element -- "+soft);
			System.out.println("element exist "+iterate.hasNext());
		}


	}

}

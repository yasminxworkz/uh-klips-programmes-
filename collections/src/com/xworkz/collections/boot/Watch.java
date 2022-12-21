package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Watch {

	public static void main(String[] args) {
		String watch1="analog";
		String watch2="digital";
		String watch3="Smart watch";
		String watch4="Dress watch";
		String watch5="Quartz watch";
		String watch6="Field watch";
		String watch7="Chronograph watch";
		String watch8="swiss watch";
		String watch9="Tactile watch";
		String watch10="Pilot Watch";
		
		Collection<String> collection=new ArrayList<String>();
		
		collection.add(watch10);
		collection.add(watch9);
		collection.add(watch8);
		collection.add(watch7);
		collection.add(watch6);
		collection.add(watch5);
		collection.add(watch4);
		collection.add(watch3);
		collection.add(watch2);
		collection.add(watch1);
		
		System.out.println(collection);
		
		
	
		Iterator<String> iterate=collection.iterator();
	
		while(iterate.hasNext()) {
			String soft=iterate.next();
			System.out.println("name of the element -- "+soft);
			System.out.println("element exist "+iterate.hasNext());
		}

	}

}

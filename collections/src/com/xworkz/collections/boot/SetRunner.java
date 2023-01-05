package com.xworkz.collections.boot;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.xworkz.collections.dto.BottleSetDTO;

public class SetRunner {

	public static void main(String[] args) {
		
		
		BottleSetDTO bottle1=new BottleSetDTO("waterBottle", 12.5, "blue", "cylindrical", 100);
		BottleSetDTO bottle2=new BottleSetDTO("OilBottle", 8.5, "yellow", "square", 150);
		BottleSetDTO bottle3=new BottleSetDTO("wineBottle", 12.5, "blue", "cylindrical", 100);
		BottleSetDTO bottle4=new BottleSetDTO("colddrinksBottle", 12.5, "blue", "cylindrical", 100);
		BottleSetDTO bottle5=new BottleSetDTO("waterBottle", 12.5, "blue", "cylindrical", 100);
		
		
		
	Set<BottleSetDTO> rice= new HashSet<BottleSetDTO>();
	rice.add(bottle1);
	rice.add(bottle2);
	rice.add(bottle3);
	rice.add(bottle4);
	rice.add(bottle5);
	
	Iterator<BottleSetDTO> it=rice.iterator();
	
	System.out.println(bottle1.hashCode());
	while(it.hasNext()) {
		BottleSetDTO s=it.next();
		
		System.out.println(s);
		
		System.out.println(" hashcode----"+System.identityHashCode(s));
		
	}
	
//		rice.add("veg rice");
//		rice.add("fried rice");
//		rice.add("egg rice");
//		rice.add("pulaav");
//		rice.add("jeera rice");
//		rice.add("kaaju rice");
//		rice.add("ghee rice");
//		rice.add("tomato rice");
//		rice.add("puliogre");
//		rice.add("vaangibhaath");
//		rice.add("curd rice");
//		rice.add("shezwan rice");
//		rice.add("curd rice");
//		
//	
//		
//		for (String string : rice) {
//			System.out.println(string);
//		}
//		
//		System.out.println(rice.size());

	}

}

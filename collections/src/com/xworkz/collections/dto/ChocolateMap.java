package com.xworkz.collections.dto;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ChocolateMap {

	public static void main(String[] args) {
		Map<String, Double> m=new HashMap<String, Double>();
		m.put("Kitkat", 120.5);
		m.put("dairyMilk", 75.5);
		m.put("Munch", 45.5);
		m.put("snickers", 25.5);
		m.put("5star", 35.5);
		m.put("Wafers", 15.5);
		m.put("nuttynutt", 10.5);
		m.put("Eclairs", 2.5);
		m.put("pulse", 1.0);
		m.put("alpenlibey", 10.5);
		
		Set s=m.entrySet();
		  Iterator itr=s.iterator();  
		    while(itr.hasNext()){  
		        //Converting to Map.Entry so that we can get key and value separately  
		        Map.Entry entry=(Map.Entry)itr.next();  
		        System.err.println(entry);
		        System.out.println(entry.getKey());  
		        System.out.println(entry.getValue());
		       
		    }  

	}

}

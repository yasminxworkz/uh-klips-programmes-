package com.xworkz.collections.dto;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class City {

	public static void main(String[] args) {
		Map<String, Double> m=new HashMap<String, Double>();
		m.put("gadag", 25.5);
		m.put("bagalkot", 28.5);
		m.put("hubli", 30.5);
		m.put("gulbarga", 32.5);
		m.put("rajasthan", 35.5);
		m.put("goa", 32.5);
		m.put("dwd", 29.5);
		m.put("assam", 27.5);
		m.put("bellary", 33.5);
		m.put("guledgudd", 31.5);
		
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

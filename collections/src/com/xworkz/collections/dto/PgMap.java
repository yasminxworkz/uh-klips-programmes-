package com.xworkz.collections.dto;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PgMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("khushi", 5000);
		map.put("vandana", 6000);
		map.put("spoorti", 7000);
		map.put("ganesh", 4000);
		map.put("priya", 8000);
		map.put("Srivari", 6500);
		map.put("SRM", 5500);
		map.put("FrankFurt", 8000);
		map.put("Amsterdam", 10000);
		map.put("Sofia", 8000);
		System.out.println(map.entrySet());
		
		Set s=map.entrySet();
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

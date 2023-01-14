package com.xworkz.collections.dto;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Long,String> m=new HashMap<Long, String>();
		m.put(582101l, "gadag");
		m.put(582102l, "betgeri");
		m.put(582103l, "vivekanandaNagar");
		m.put(582104l, "mulgundnaaka");
		m.put(582105l, "hudko");
		m.put(582106l, "zakihussaincolony");
		m.put(582107l, "tajnagar");
		m.put(582108l, "sharanbasweshwar");
		m.put(582109l, "shankarmath");
		m.put(5821010l, "gandinagar");
		
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

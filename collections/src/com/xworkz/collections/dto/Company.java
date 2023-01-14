package com.xworkz.collections.dto;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> m=new HashMap<String, String>();
		m.put("MSFT", "excel");
		m.put("ORCL", "peoplesoft");
		m.put("SAP", "SAP Access Control");
		m.put("CRM", "Zoho");
		m.put("ADBE", "animate");
		m.put("SQ", "Sedinblue");
		m.put("INTU", "snowvivo");
		m.put("VMW", "hubspot");
		m.put("ADYEY", "workwise");
		m.put("NOW", "zendesk");
		
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

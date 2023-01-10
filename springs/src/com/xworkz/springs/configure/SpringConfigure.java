package com.xworkz.springs.configure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.xworkz.springs"})
public class SpringConfigure {
	
	@Bean
	public String book() {
		String b=new String("bookMethod");
		return b;
	}
	
	@Bean
	public String chair() {
		String c=new String("chairMethod");
		return c;
	}
	@Bean
	public String table() {
		String s=new String("tableMethod");
		return s;
	}
	
	@Bean
	public String color() {
		String s=new String("colorMethod");
		return s;
	}
	
	@Bean
	public String pen() {
		String p=new String("penMethod");
		return p;
	}
	
	@Bean
	public Double noteBook() {
		Double n=new Double(324D);
		return n;
	}
	
	@Bean
	public Double red() {
		Double r=new Double(2554D);
		return r;
	}
	
	@Bean
	public Double wheel() {
		Double w=new Double(200D);
		return w;
	}
	
	@Bean
	
	public Double reynolds() {
		Double r=new Double(234D);
		return r;
	}
	
	@Bean
	public Double wood() {
		Double w=new Double(123D);
		return w;
	}
	
	@Bean
	public Boolean page() {
		Boolean b=new Boolean(false);
		return b;
	}
	
	@Bean
	public Boolean legs() {
		Boolean l=new Boolean(true);
		return l;
	}
	
	@Bean
	public Boolean vibgyor() {
		Boolean v=new Boolean(true);
		return v;
	}
	
	@Bean
	public Boolean support() {
		Boolean s=new Boolean(true);
		return s;
	}
	
	@Bean
	public Boolean read() {
		Boolean r=new Boolean(false);
		return r;
	}
	
	@Bean
	public StringBuffer age() {
		
		StringBuffer j=new StringBuffer(18);
		
		return j ;
		
	}
	
	@Bean
      public StringBuffer noOfBottles() {
		
		StringBuffer water=new StringBuffer(16);
		
		return water ;
		
	}

	@Bean
     public StringBuffer noOfBus() {
	
	StringBuffer bus=new StringBuffer(100);
	
	return bus ;
	
}

	@Bean
    public StringBuffer noOfPassengers() {
	
	StringBuffer pa=new StringBuffer(1000);
	
	return pa ;
	
}

	@Bean
    public StringBuffer typeOfTrains() {
	
	StringBuffer tr=new StringBuffer(10);
	
	return tr ;
	
}
	@Bean
    public StringBuilder developer() {
		
    	StringBuilder st=new StringBuilder()	;
    	return st;
    	
    }
	@Bean
public StringBuilder trainee() {
		
    	StringBuilder tr=new StringBuilder('Y')	;
    	return tr;
    	
    }
	
	@Bean
public StringBuilder nameWith() {
	
	StringBuilder w=new StringBuilder('M')	;
	return w;
	
}
	@Bean
public StringBuilder waterCapacity() {
	
	StringBuilder wc=new StringBuilder(10);
	return wc;
	
}
	@Bean
public StringBuilder institute() {
	
	StringBuilder ins=new StringBuilder("X-workz")	;
	return ins;
	
}

	@Bean("map")
public  Map<Integer, String> tour(){
	
	Map<Integer, String> m=new HashMap<Integer, String>();
	m.put(1, "gadag");
	m.put(2, "bangalore");
	m.put(3, "guledgudd");
	m.put(1, "bagalkot");
	m.put(1, "hubli");
	
	return m;
	
    }
    
	@Bean("areas")
     public  ArrayList<String> areaNames() {
		
    	 ArrayList<String> name=new ArrayList<String>();
    	 name.add("rajajinagar");
    	 name.add("jaynagar");
    	 name.add("jcnagar");
    	 name.add("basveshwarnagar");
    	 name.add("vivekanandnagar");

    	 return name;
    	 
     }


  
	
	

}

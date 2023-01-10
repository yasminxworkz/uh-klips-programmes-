package com.xworkz.springs.configure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.xworkz.springs"})
public class SpringConfigure {
	
	public String book() {
		String b=new String();
		return b;
	}
	
	public String chair() {
		String c=new String();
		return c;
	}
	public String table() {
		String s=new String();
		return s;
	}
	public String color() {
		String s=new String();
		return s;
	}
	
	public String pen() {
		String p=new String();
		return p;
	}
	
	public Double noteBook() {
		Double n=new Double("vidya");
		return n;
	}
	
	public Double red() {
		Double r=new Double("chilli");
		return r;
	}
	
	public Double wheel() {
		Double w=new Double("comfort");
		return w;
	}
	
	public Double reynolds() {
		Double r=new Double("blue");
		return r;
	}
	
	public Double wood() {
		Double w=new Double("box");
		return w;
	}
	
	public boolean page() {
		Boolean b=new Boolean(false);
		return b;
	}
	
	public boolean legs() {
		Boolean l=new Boolean(true);
		return l;
	}
	
	public boolean vibgyor() {
		Boolean v=new Boolean(true);
		return v;
	}
	
	public boolean support() {
		Boolean s=new Boolean(true);
		return s;
	}
	
	public boolean read() {
		Boolean r=new Boolean(false);
		return r;
	}
	
	public StringBuffer age() {
		
		StringBuffer j=new StringBuffer(18);
		
		return j ;
		
	}
	
	
      public StringBuffer noOfBottles() {
		
		StringBuffer water=new StringBuffer(16);
		
		return water ;
		
	}

     public StringBuffer noOfBus() {
	
	StringBuffer bus=new StringBuffer(100);
	
	return bus ;
	
}

    public StringBuffer noOfPassengers() {
	
	StringBuffer pa=new StringBuffer(1000);
	
	return pa ;
	
}

    public StringBuffer typeOfTrains() {
	
	StringBuffer tr=new StringBuffer(10);
	
	return tr ;
	
}
    public StringBuilder developer() {
		
    	StringBuilder st=new StringBuilder()	;
    	return st;
    	
    }
    
public StringBuilder trainee() {
		
    	StringBuilder tr=new StringBuilder('Y')	;
    	return tr;
    	
    }

public StringBuilder nameWith() {
	
	StringBuilder w=new StringBuilder('M')	;
	return w;
	
}

public StringBuilder waterCapacity() {
	
	StringBuilder wc=new StringBuilder(10);
	return wc;
	
}

public StringBuilder institute() {
	
	StringBuilder ins=new StringBuilder("X-workz")	;
	return ins;
	
}

public  Map<Integer, String> tour(){
	
	Map<Integer, String> m=new HashMap<Integer, String>();
	m.put(1, "gadag");
	m.put(2, "bangalore");
	m.put(3, "guledgudd");
	m.put(1, "bagalkot");
	m.put(1, "hubli");
	
	return m;
	
    }
    
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

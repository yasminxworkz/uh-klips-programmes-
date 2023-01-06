package com.xworkz.alltopics.association.boot;

import com.xworkz.alltopics.association.things.FacePowder;
import com.xworkz.alltopics.association.things.Ponds;

public class FacePowderRunner {

	public static void main(String[] args) {
		
		
		Ponds p=new Ponds();
		p.details("bangalore", "xyz", 12);
		
		
		FacePowder f=new FacePowder();
		f.display("ponds", 80, 250);
		f.associatedClass(p);
		f.readValues();
		
	}

}

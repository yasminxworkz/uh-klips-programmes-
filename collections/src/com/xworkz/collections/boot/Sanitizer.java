package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import java.util.Iterator;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;
import com.xworkz.collections.dto.SanitizerDTO;

public class Sanitizer {

	public static void main(String[] args) {
		SanitizerDTO sanitize1=new SanitizerDTO(1011983, "savlon", 200, "blue");
		SanitizerDTO sanitize2=new SanitizerDTO(1011983, "lifeboy", 250, "green");
		SanitizerDTO sanitize3=new SanitizerDTO(1011983, "dettol", 300, "yellow");
		SanitizerDTO sanitize4=new SanitizerDTO(1011983, "himalaya", 4, "colorless");
		SanitizerDTO sanitize5=new SanitizerDTO(1011983, "godrej", 20, "orange");
		SanitizerDTO sanitize6=new SanitizerDTO(1011983, "yardley", 25, "purple");
		SanitizerDTO sanitize7=new SanitizerDTO(1011983, "santoor", 40, null);
		SanitizerDTO sanitize8=new SanitizerDTO(1011983, "dove", 80, "red");
		SanitizerDTO sanitize9=new SanitizerDTO(1011983, null, 150, "brown");
		SanitizerDTO sanitize10=new SanitizerDTO(1011983, "viva", 100, "black");
		
		Collection<SanitizerDTO> collect=new ArrayList<>();
		
		collect.add(sanitize10);
		collect.add(sanitize9);
		collect.add(sanitize8);
		collect.add(sanitize7);
		collect.add(sanitize6);
		collect.add(sanitize5);
		collect.add(sanitize4);
		collect.add(sanitize3);
		collect.add(sanitize2);
		collect.add(sanitize1);
		
		
		// price>5
		//check for null and print it
		//if color is green then remove sanitizer
		//least price
		//max price
		//2nd max price
		System.out.println(System.lineSeparator());
		System.out.println("*************************************************************FINDING SANITIZER WITH least and max Price************************************************");
		System.out.println(System.lineSeparator());
		System.out.println(collect);
		SanitizerDTO min=Collections.min(collect);
		System.out.println("least price------"+min);
		
		SanitizerDTO max=Collections.max(collect);
		System.out.println("maximum price------"+max);
		
		System.out.println(System.lineSeparator());
		System.out.println("********************************************************OR*****************************************************************8");
		
		
		SanitizerDTO price=((ArrayList<SanitizerDTO>) collect).get(0);
	

		for (SanitizerDTO sanit : collect) {
			if(sanit.getPrice()<price.getPrice()) {
				price=sanit;
			}
			
		}
		System.out.println("leastPrice================"+price);
		for (SanitizerDTO sanit : collect) {
			if(sanit.getPrice()>price.getPrice()) {
				price=sanit;
			}
			
		}
		System.out.println("maxPrice================"+price);
	
	
	
		System.out.println(System.lineSeparator());
		System.out.println("*************************************************************FINDING SANITIZER WITH price >5************************************************");
		System.out.println(System.lineSeparator());
		Iterator<SanitizerDTO> iterate= collect.iterator();
		
		while(iterate.hasNext()) {
			SanitizerDTO hygiene= iterate.next();
			
			if(hygiene.getPrice()>5) {
				System.out.println("sanitizers with price greater than 5----- "+hygiene.getBrand());
			}
			

		}
		System.out.println(System.lineSeparator());
		System.out.println("************************************************************FINDING SANITIZER WITH green,red,blue color*************************************************");
		System.out.println(System.lineSeparator());
		Iterator<SanitizerDTO> iterate1=collect.iterator();
		while(iterate1.hasNext()) {
			SanitizerDTO clean=iterate1.next();
			
			if(clean.getColor()=="green"||clean.getColor()=="blue"||clean.getColor()=="red") {
			
			System.out.println("green, red, blue colored sanitizer"+clean);
			iterate1.remove();
			
		}
		}
			
			System.out.println(collect.size());
			
			System.out.println(System.lineSeparator());
			System.out.println("**************************************************************FINDING SANITIZER WITH NULL VALUE***********************************************");
			System.out.println(System.lineSeparator());
			Iterator<SanitizerDTO> iterate2=collect.iterator();
			while(iterate2.hasNext()) {
				SanitizerDTO cleans=iterate2.next();
				
				if(cleans.getBrand()==null || cleans.getColor()==null  ) {
				
				System.out.println("sanitizer with null value ---"+cleans);
				
				
			}
			}
			
			
			

			
			
			
			
		
		

	
	}
}



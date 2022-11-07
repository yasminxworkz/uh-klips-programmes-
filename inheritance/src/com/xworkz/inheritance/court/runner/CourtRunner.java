package com.xworkz.inheritance.court.runner;

import com.xworkz.inheritance.court.constructor.*;


public class CourtRunner {
	public static void main(String[] args) {
		
	
	
	Court law=new Court();
	System.out.println(law.function);
	System.out.println(law.types);
	
	DistrictCourt district=new DistrictCourt();
	System.out.println(district.districtName);
	System.out.println(district.yearOfEstablishment);
	System.out.println(district.function);
	System.out.println(district.types);
	
	Court district1=new DistrictCourt();       //copy of child class with parent class
	System.out.println(district1.function);
	System.out.println(district1.types);
	
	DistrictCourt insaaf=(DistrictCourt)district1;   //casting is done here.casting is conversion of parent class ref to child class ref.
	System.out.println(insaaf.districtName);
	System.out.println(insaaf.yearOfEstablishment);
	
	HighCourt justice=new HighCourt();
	System.out.println(justice.JudgeName);
	System.out.println(justice.State);
	System.out.println(justice.function);
	System.out.println(justice.types);
	
	Court justice1=new HighCourt();               // copy of child class with parent class
	System.out.println(justice1.function);
	System.out.println(justice1.types);
	
	HighCourt insaaf1=(HighCourt)justice1;      //casting
	System.out.println(insaaf1.JudgeName);
	System.out.println(insaaf1.State);
	
	
	
	SupremeCourt supreme=new SupremeCourt();
	System.out.println(supreme.judgeAge);
	System.out.println(supreme.tenure);
	System.out.println(supreme.function);
	System.out.println(supreme.types);
	
	Court supreme1=new SupremeCourt();            //  copy of child class with parent class
	System.out.println(supreme1.function);
	System.out.println(supreme1.types);
	
	SupremeCourt insaaf2=(SupremeCourt)supreme1;    //casting
	System.out.println(insaaf2.judgeAge);
	System.out.println(insaaf2.tenure);
	

}
}

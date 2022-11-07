package com.xworkz.inheritance.jail.runner;

import com.xworkz.inheritance.jail.constructor.*;


public class JailRunner {
	public static void main(String[] args) {
		
		Jail prison=new Jail();
		System.out.println(prison.biggestJail);
		System.out.println(prison.function);
		
		CentralJail centre=new CentralJail();
		System.out.println(centre.noOfPrisoners);
		System.out.println(centre.working);
		System.out.println(centre.function);
		System.out.println(centre.biggestJail);
		
		Jail centre1=new CentralJail();              //copy of child class with parent class
		System.out.println(centre1.biggestJail);
		System.out.println(centre1.function);
		
		CentralJail punish1=(CentralJail)centre1;    //casting is done here.casting is conversion of parent class ref to child class ref.
		System.out.println(punish1.noOfPrisoners);
		System.out.println(punish1.working);
		
		SubJail sub=new SubJail();
		System.out.println(sub.biggestJail);
		System.out.println(sub.function);
		System.out.println(sub.locationAtAP);
		System.out.println(sub.stationContactNumber);
		
		Jail sub1=new SubJail();                   //copy of child class with parent class
		System.out.println(sub1.biggestJail);
		System.out.println(sub1.function);
		
		SubJail punish2=(SubJail)sub1;            //casting
		System.out.println(punish2.biggestJail);
		System.out.println(punish2.function);
		System.out.println(punish2.locationAtAP);
		System.out.println(punish2.stationContactNumber);
		
		
		DistrictJail jail=new DistrictJail();
		System.out.println(jail.biggestJail);
		System.out.println(jail.function);
		System.out.println(jail.presentDGP);
		System.out.println(jail.state);
		
		Jail jail1=new DistrictJail();               //copy of child class with parent class
		System.out.println(jail1.biggestJail);
		System.out.println(jail1.function);
		
		DistrictJail punish3=(DistrictJail)jail1;    //casting
		System.out.println(punish3.presentDGP);
		System.out.println(punish3.state);
	}

}

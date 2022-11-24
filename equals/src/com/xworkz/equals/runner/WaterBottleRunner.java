package com.xworkz.equals.runner;

import com.xworkz.equals.contructor.WaterBottle;

public class WaterBottleRunner {

	public static void main(String[] args) {
		 WaterBottle paani=new  WaterBottle("puroSteelX", "PET bottle", "white", "aluminium", "medium", "cello", 40, 1.5,250, true);
	   System.out.println(paani);
		 
		 WaterBottle paani1=new  WaterBottle("puroSteelX", "PET bottle", "black", "aluminium", "small", "puma", 40, 1.0,150, false);
	    System.out.println(paani1);
	    
	    boolean drink=paani.equals(paani1);
	    System.out.println(drink);
	}

}

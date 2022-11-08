package com.xworkz.inheritance.marriage.runner;

import com.xworkz.inheritance.marriage.constructor.ArrangeMarriage;
import com.xworkz.inheritance.marriage.constructor.Marriage;

public class MarriageRunner {

	public static void main(String[] args) {
		Marriage marry=new ArrangeMarriage("saima", 8,5000);
		System.out.println(marry.brideName);
		System.out.println(marry.noOfDish);
		System.out.println(marry.members);
		
	}

}

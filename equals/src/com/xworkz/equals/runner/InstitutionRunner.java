package com.xworkz.equals.runner;

import com.xworkz.equals.contructor.Institution;

public class InstitutionRunner {

	public static void main(String[] args) {
		Institution institute=new Institution("KLE", "Gadag", "teaching", 50, 10, 40000, 20000, 2, 500, true);
        System.out.println(institute);
	
        Institution institute1=new Institution("KUD", "Dwd", "teaching", 100, 10, 60000, 30000, 4, 1000, true);
	     System.out.println(institute1);
	     
	     boolean teach=institute.equals(institute1);
	     System.out.println(teach);
	}

}

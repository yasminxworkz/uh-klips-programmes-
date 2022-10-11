package com.xworkz.tasktoday.boot;

import com.xworkz.tasktoday.constructor.Developer;

public class DeveloperRunner {

	public static void main(String[] args) {
		
		Developer developer=new Developer();
		
		System.out.println(developer.name);
		System.out.println(developer.education);
		System.out.println(developer.experience);
		System.out.println(developer.salary);
		System.out.println(developer.company);
		
		developer.name="yasmin";
		developer.education="BSc";
		developer.experience=5;
		developer.salary=600000;
		developer.company="HCL";
		System.out.println(developer.name);
		System.out.println(developer.education);
		System.out.println(developer.experience);
		System.out.println(developer.salary);
		System.out.println(developer.company);
		
   
	}

}

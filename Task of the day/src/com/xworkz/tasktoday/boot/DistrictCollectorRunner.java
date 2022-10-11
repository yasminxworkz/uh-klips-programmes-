package com.xworkz.tasktoday.boot;

import com.xworkz.tasktoday.constructor.DistrictCollector;

public class DistrictCollectorRunner {
	
	public static void main(String[] args) {
		DistrictCollector districtCollector1=new DistrictCollector();
		System.out.println(districtCollector1.name);
		System.out.println(districtCollector1.district);
		System.out.println(districtCollector1.age);
		System.out.println(districtCollector1.batchNo);
		
		districtCollector1.name="junaid ahmed";
		districtCollector1.district="bareilly";
		districtCollector1.age=27;
		districtCollector1.batchNo=2018;
		
		System.out.println(districtCollector1.name);
		System.out.println(districtCollector1.district);
		System.out.println(districtCollector1.age);
		System.out.println(districtCollector1.batchNo);
		
	}

}

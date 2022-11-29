package com.xworkz.interfaces.hospital.boot;

import com.xworkz.interfaces.hospital.Hospital;
import com.xworkz.interfaces.hospital.Lotus;

public class LotusRunner {

	public static void main(String[] args) {
		
		Lotus lotus=new Lotus();
		lotus.name();
		lotus.location();
		lotus.noOfStaff();
		lotus.floors();
		lotus.working();
		lotus.workingHrs();
		
		Hospital check=new Lotus();
		check.name();
		check.location();
		check.noOfStaff();
		check.floors();
		check.working();
		

	}

}

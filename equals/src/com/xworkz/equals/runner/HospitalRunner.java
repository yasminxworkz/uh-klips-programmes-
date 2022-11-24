package com.xworkz.equals.runner;

import com.xworkz.equals.contructor.Hospital;

public class HospitalRunner {

	public static void main(String[] args) {
		
		Hospital surgery=new Hospital("Sanjeevini", "bagalkot", "ENT", "white", 50, 200, 200, 24, 20000, true);
        System.out.println(surgery);
        
        Hospital surgery1=new Hospital("modi", "bangalore", "eyeSpecialist", "white", 50, 500, 100, 24, 30000, true);
        System.out.println(surgery1);
        
        boolean doctor=surgery.equals(surgery1);
        System.out.println(doctor);
	}

}

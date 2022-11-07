package com.xworkz.inheritance.doctor.runner;

import com.xworkz.inheritance.doctor.constructor.*;



public class DoctorRunner {
	public static void main(String[] args) {
		
		Doctor treat=new Doctor();
		System.out.println(treat.name);
		System.out.println(treat.salary);
		
		Dentist tooth=new Dentist();
		System.out.println(tooth.location);
		System.out.println(tooth.noOfPatients);
		System.out.println(tooth.name);
		System.out.println(tooth.salary);
		
		Doctor doctor1=new Dentist();        //copy of child class with parent class
		System.out.println(doctor1.name);
		System.out.println(doctor1.salary);
	
		
		Dentist dent=(Dentist)doctor1;         // casting is done here.casting is conversion of parent class ref to child class ref.
		System.out.println(dent.location);
		System.out.println(dent.noOfPatients);
		
		
		
		Cardiologist hospital1=new Cardiologist();
		System.out.println(hospital1.name);
		System.out.println(hospital1.salary);
		System.out.println(hospital1.device);
		System.out.println(hospital1.wife);
		
		Doctor doctor2=new Cardiologist();           //copy of child class with parent class
		System.out.println(doctor2.name);
		System.out.println(doctor2.salary);
		
		Cardiologist heart=(Cardiologist)doctor2;    // casting
		System.out.println(heart.device);
		System.out.println(heart.wife);
		
		ENT tongue=new ENT();
		System.out.println(tongue.name);
		System.out.println(tongue.salary);
		System.out.println(tongue.noOfEmployes);
		System.out.println(tongue.workingHrs);
		
		Doctor doctor3=new ENT();                      //copy of child class with parent class
		System.out.println(doctor3.name);
		System.out.println(doctor3.salary);
		
		ENT nose=(ENT)doctor3;                          // casting
		System.out.println(nose.noOfEmployes);
		System.out.println(nose.workingHrs);
		
		
		
		
		
	}

}

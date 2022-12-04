package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.constructor.HospitalRule;
import com.xworkz.abstraction.constructor.ModiHospital;
import com.xworkz.abstraction.constructor.VisitorsRule;

public class ModiHospitalRunner {

	public static void main(String[] args) {
		HospitalRule hospital=new VisitorsRule();
		
		ModiHospital eye=new ModiHospital(hospital);
		eye.rulesCheck();
		

	}

}

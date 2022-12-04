package com.xworkz.interfaces.interfaces.constructor;

public class XWorkzRajajinagar implements Xworkz,TrafficRules {

	@Override
	public boolean interview() {
		System.out.println("this a interview method");
		return false;
	}

	
	@Override
	public void training() {
		System.out.println("this is from institute");
		
	}

	@Override
	public void placement() {
		System.out.println("this is from institute");
		
	}

	@Override
	public void wearHelmet() {
		System.out.println("this is from traffic rule");
		
	}

	@Override
	public void tripleRiding() {
		System.out.println("this is from traffic rule");
		
	}

}

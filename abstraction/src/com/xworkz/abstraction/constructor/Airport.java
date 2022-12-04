package com.xworkz.abstraction.constructor;

public class Airport {
	
	private AirPortRules rule;

	public Airport(AirPortRules rule) {
		super();
		this.rule = rule;
	}
	
	public void checkRules() {
		if(rule!=null) {
			boolean phone=this.rule.phoneInAirplaneMode();
			double food=this.rule.maxWeightOfFoodItems();
			if(phone==true && food<6) {
				System.out.println("passenger is following the rules");
			}
			else {
				System.out.println("passenger is breaking the rules");
			}
		}
	}

}

package com.xworkz.abstraction.constructor;

public class VisitorsRule implements HospitalRule {

	@Override
	public boolean wearMask() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int maintainDistance() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public boolean wearGloves() {
		// TODO Auto-generated method stub
		return false;
	}

}

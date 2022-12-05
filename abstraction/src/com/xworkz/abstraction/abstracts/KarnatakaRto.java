package com.xworkz.abstraction.abstracts;

public interface KarnatakaRto extends TransportRule {
	@Override
	default boolean paidTax(double income) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	default double gst() {
		// TODO Auto-generated method stub
		return 0;
	}

	double vat();

}

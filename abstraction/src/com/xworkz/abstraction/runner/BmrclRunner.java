package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.constructor.*;

public class BmrclRunner {

	public static void main(String[] args) {
		MetroRules metro=new TravellersRule();
		Bmrcl train=new Bmrcl(metro);
		train.checkRules();

	}

}

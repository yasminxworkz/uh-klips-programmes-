package com.xworkz.alltopics.abstraction.boot;

import com.xworkz.alltopics.abstraction.thing.Bank;
import com.xworkz.alltopics.abstraction.thing.CanaraBank;
import com.xworkz.alltopics.abstraction.thing.Rbi;

public class RBIRunner {

	public static void main(String[] args) {
		Bank b=new CanaraBank();
		Rbi r=new Rbi(b);
		r.checkBalance();
	}

}

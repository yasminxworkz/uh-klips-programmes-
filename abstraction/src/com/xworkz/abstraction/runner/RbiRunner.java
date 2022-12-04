package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.constructor.BankRule;
import com.xworkz.abstraction.constructor.CanaraBank;
import com.xworkz.abstraction.constructor.Rbi;

public class RbiRunner {

	public static void main(String[] args) {
		 BankRule bank=new CanaraBank();
		 Rbi money=new Rbi(bank);
		 money.checkBalance();

	}

}

package com.xworkz.equals.runner;

import com.xworkz.equals.contructor.Currency;

public class CurrencyRunner {

	public static void main(String[] args) {
		Currency money=new Currency("Rupee", "coins", "RBI",3, 2, 4, "mumbai", "shaktikanta");
		System.out.println(money);
		
		
		Currency money1=new Currency("rupee", "coins", "RBI",3, 2, 4, "mumbai", "urjit");
	    System.out.println(money1);
	    
	    boolean fund=money.equals(money1);//obj:this
	    System.out.println(fund);
	}

}

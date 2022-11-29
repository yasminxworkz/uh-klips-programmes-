package com.xworkz.interfaces.country.boot;

import com.xworkz.interfaces.country.Country;
import com.xworkz.interfaces.country.India;

public class IndiaRunner {

	public static void main(String[] args) {
		India nation=new India();
		nation.name();
		nation.language();
		nation.capital();
		nation.population();
		nation.president();
		nation.isFamous();
		
		Country country=new India();
		country.capital();
		country.name();
		country.population();
		country.president();
		country.language();

	}

}

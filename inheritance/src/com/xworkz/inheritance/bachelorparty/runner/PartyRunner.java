package com.xworkz.inheritance.bachelorparty.runner;

import com.xworkz.inheritance.bachelorparty.constructor.BachelorsParty;
import com.xworkz.inheritance.bachelorparty.constructor.Party;

public class PartyRunner {

	public static void main(String[] args) {
		Party treat=new BachelorsParty("Le Arabia", "Bachelors Party", 8);
		System.out.println(treat.location);
		System.out.println(treat.type);
		System.out.println(treat.time);

	}

}

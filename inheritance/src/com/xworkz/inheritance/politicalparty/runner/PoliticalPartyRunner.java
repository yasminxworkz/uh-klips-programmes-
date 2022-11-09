package com.xworkz.inheritance.politicalparty.runner;

import com.xworkz.inheritance.politicalparty.constructor.BJP;
import com.xworkz.inheritance.politicalparty.constructor.PoliticalParty;

public class PoliticalPartyRunner {

	public static void main(String[] args) {
		PoliticalParty party=new BJP("BJP", 303, "J.P.Nadda");
		party.display();
		

	}

}

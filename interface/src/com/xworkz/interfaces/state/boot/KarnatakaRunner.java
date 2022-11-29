package com.xworkz.interfaces.state.boot;

import com.xworkz.interfaces.state.Karnataka;
import com.xworkz.interfaces.state.State;

public class KarnatakaRunner {

	public static void main(String[] args) {
		Karnataka kar=new Karnataka();
		kar.capital();
		kar.chiefMinister();
		kar.famousFor("holige");
		kar.largest();
		kar.population();
		kar.capital();
		
		State state=new Karnataka();
		state.capital();
		state.chiefMinister();
		state.famousFor("spicy dishes");
		state.largest();
		state.population();
		

	}

}

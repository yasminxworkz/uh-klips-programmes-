package com.xworkz.association.pillar.boot;

import com.xworkz.association.pillar.constructor.Pillar;

public class PillarRunner {

	public static void main(String[] args) {
		Pillar khamba=new Pillar(205,"rajajinagar",30.5d);
		khamba.support(true);
		khamba.showOff();
	}

}

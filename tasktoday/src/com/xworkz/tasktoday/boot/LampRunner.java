package com.xworkz.tasktoday.boot;

import com.xworkz.tasktoday.constructor.Lamp;

public class LampRunner {

	public static void main(String[] args) {
		
		Lamp lamp=new Lamp("yellow");
		lamp.working=true;
		lamp.setPrice();
		Lamp.lampMaterial="paper";
		lamp.display();
		
	}

}

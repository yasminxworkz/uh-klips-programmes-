package com.xworkz.tasktoday.boot;

import com.xworkz.tasktoday.constructor.Flower;

public class FlowerRunner {

	public static void main(String[] args) {
		
		Flower flower=new Flower("red",545.5d);
		flower.noOfTypes=68;
		Flower.size="small";
		flower.setPrice();
		flower.display();
		

	}

}

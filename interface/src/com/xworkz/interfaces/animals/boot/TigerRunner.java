package com.xworkz.interfaces.animals.boot;

import com.xworkz.interfaces.animals.Animals;
import com.xworkz.interfaces.animals.Tiger;

public class TigerRunner {

	public static void main(String[] args) {
		Tiger tiger=new Tiger();
		tiger.appearance();
		tiger.Carnivores();
		tiger.famousAt();
		tiger.isNationalAnimal();
		tiger.typeOfAnimals();
		tiger.lifespan();
		
		Animals animal=new Tiger();
		animal.appearance();
		animal.Carnivores();
		animal.famousAt();
		animal.lifespan();
		animal.typeOfAnimals();

	}

}

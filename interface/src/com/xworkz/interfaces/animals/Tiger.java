package com.xworkz.interfaces.animals;

public class Tiger implements Animals {

	@Override
	public void typeOfAnimals() {
	System.out.println("Wild animal");
		
	}

	@Override
	public void Carnivores() {
		System.out.println("the one which eat meat");
		
	}

	@Override
	public void lifespan() {
		System.out.println("more than 20 yrs");
		
	}

	@Override
	public void famousAt() {
		System.out.println("madhyapradesh");
		
	}

	@Override
	public void appearance() {
		System.out.println("orange or white with black strips");
		
	}
	
	public boolean isNationalAnimal() {
		System.out.println(true);
		return true;
	}

}

package com.xworkz.taskToday.boot;

import com.xworkz.taskToday.constructor.Fish;

public class FishRunner {

	public static void main(String[] args) {
	
		Fish fish=new Fish("fighterFish");
		System.out.println("fish.name: "+ fish.name);
		System.out.println("fish.type: "+fish.type);
		System.out.println("fish.price: "+fish.price);
		System.out.println("fish.weight: "+fish.weight);
		System.out.println("fish.length: "+fish.length);
		System.out.println("------------------------------------------");
		
		 fish=new Fish("freshwaterfish",250);
		 System.out.println("fish.name: "+ fish.name);
			System.out.println("fish.type: "+fish.type);
			System.out.println("fish.price: "+fish.price);
			System.out.println("fish.weight: "+fish.weight);
			System.out.println("fish.length: "+fish.length);
			System.out.println("------------------------------------------");
		
		     fish=new Fish(250,20.5);
		     System.out.println("fish.name: "+ fish.name);
				System.out.println("fish.type: "+fish.type);
				System.out.println("fish.price: "+fish.price);
				System.out.println("fish.weight: "+fish.weight);
				System.out.println("fish.length: "+fish.length);
				System.out.println("------------------------------------------");
			
			fish=new Fish(3,20.5);
			System.out.println("fish.name: "+ fish.name);
			System.out.println("fish.type: "+fish.type);
			System.out.println("fish.price: "+fish.price);
			System.out.println("fish.weight: "+fish.weight);
			System.out.println("fish.length: "+fish.length);
			System.out.println("------------------------------------------");
		
		
			fish=new Fish("fighterfish",3);
			System.out.println("fish.name: "+ fish.name);
			System.out.println("fish.type: "+fish.type);
			System.out.println("fish.price: "+fish.price);
			System.out.println("fish.weight: "+fish.weight);
			System.out.println("fish.length: "+fish.length);
			System.out.println("------------------------------------------");
		
			
			fish=new Fish(250);
			System.out.println("fish.name: "+ fish.name);
			System.out.println("fish.type: "+fish.type);
			System.out.println("fish.price: "+fish.price);
			System.out.println("fish.weight: "+fish.weight);
			System.out.println("fish.length: "+fish.length);
			System.out.println("------------------------------------------");
			
			fish=new Fish(3);
			System.out.println("fish.name: "+ fish.name);
			System.out.println("fish.type: "+fish.type);
			System.out.println("fish.price: "+fish.price);
			System.out.println("fish.weight: "+fish.weight);
			System.out.println("fish.length: "+fish.length);
			System.out.println("------------------------------------------");
			
			fish=new Fish("fighterfish","freshwaterfish");
			System.out.println("fish.name: "+ fish.name);
			System.out.println("fish.type: "+fish.type);
			System.out.println("fish.price: "+fish.price);
			System.out.println("fish.weight: "+fish.weight);
			System.out.println("fish.length: "+fish.length);
	}

}

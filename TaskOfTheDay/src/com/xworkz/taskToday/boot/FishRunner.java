package com.xworkz.taskToday.boot;

import com.xworkz.taskToday.constructor.Fish;

public class FishRunner {

	public static void main(String[] args) {
	
		Fish fish=new Fish("fighterFish");
		Fish.color="yellow";                         //------>this is the static way of accessing variable --->that is using the class name
		System.out.println("fish.name: "+ fish.name);
		System.out.println("fish.type: "+fish.type);
		System.out.println("fish.price: "+fish.price);
		System.out.println("fish.weight: "+fish.weight);
		System.out.println("fish.length: "+fish.length);
		System.out.println("colr :"+fish.color);
		System.out.println("------------------------------------------");
		
		Fish fish1=new Fish("jelly fish");
		fish1.color="orange";                      //------>this is not the static way of accessing variable --->that is using the class name
		System.out.println("fish1.name: "+ fish1.name);   //output is jelly fish--------->instance variables----->creates many copies;
		System.out.println("fish.name: "+ fish.name);     //output is fighterfish;
		System.out.println("fish1.color: "+ fish.color);    //output is orange
		System.out.println("fish.color: "+ fish.color);     //output is orange------------>static variable creates single copy;
		
		
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

package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Animal {

	public static void main(String[] args) {
		String animal1="Tiger";
		String animal2="Cat";
		String animal3="Dog";
		String animal4="Lion";
		String animal5="Elephant";
		String animal6="Deer";
		String animal7="Leopard";
		String animal8="Turtle";
		String animal9="Crocodile";
		String animal10="cow";
		
		Collection<String> collection=new ArrayList<String>();
		
		collection.add(animal10);
		collection.add(animal9);
		collection.add(animal8);
		collection.add(animal7);
		collection.add(animal6);
		collection.add(animal5);
		collection.add(animal4);
		collection.add(animal3);
		collection.add(animal2);
		collection.add(animal1);
		
		System.out.println(collection);
		
		
	
		Iterator<String> iterate=collection.iterator();
	
		while(iterate.hasNext()) {
			String soft=iterate.next();
			System.out.println("name of the element -- "+soft);
			System.out.println("element exist "+iterate.hasNext());
		}

	}
	

}

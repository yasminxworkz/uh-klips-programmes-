package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListRunner {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("0....red");
		list.add("1...blue");
		list.add("2...green");
		list.add("3...black");
		list.add("4...voilet");
		list.add("5...pink");
		list.add("6...white");
		list.add("7...skyblue");
		list.add("8...darkgreen");
		list.add("9...neon");

		
		list.add(1, "1...yellow");
		for (String string : list) {
			System.out.println(string);
		}
		
		System.out.println("*********************************************remove method******************************************");
		list.remove(2);
		for (String string : list) {
			System.out.println(string);
		}
		
		System.out.println("*********************************************set method******************************************");

		list.set(0, "0...orange");
		for (String string : list) {
			System.out.println(string);
		}
		
		
		System.out.println("************************************************get method*******************************************************");
		String color=list.get(2);
		System.out.println(color);
		
		System.out.println("*************************************indexof************************");
		int index=list.indexOf(color);
		
		System.out.println(index);
		
	boolean contain=	list.contains("yellow");
	System.out.println(contain);
	
	//ListIterator any=list.listIterator(5);
	System.out.println("***********************iterator in backward or reverse direction from any index***************************************");
	ListIterator<String> any=list.listIterator(6);
	while ( any.hasPrevious()) {
		
		System.out.println(any.previous());
		
	}

	
		
		
		

	}

}

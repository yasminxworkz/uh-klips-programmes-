package com.xworkz.interfaces.shoe.boot;

import com.xworkz.interfaces.shoe.Shoe;

public class Bata implements Shoe {

	@Override
	public void brand() {
		System.out.println("nike");
		
	}

	@Override
	public void size() {
	System.out.println("large");
		
	}

	@Override
	public void type() {
		System.out.println("sports");
		
	}

	@Override
	public String color() {
		System.out.println("white");
		return null;
	}

	@Override
	public boolean comfort() {
		System.out.println("is comfortable");
		return false;
	}
	
	public boolean easy() {
		return true;
	}

}

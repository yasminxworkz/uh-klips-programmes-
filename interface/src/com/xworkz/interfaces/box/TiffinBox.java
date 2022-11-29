package com.xworkz.interfaces.box;

public class TiffinBox implements Box {

	@Override
	public void type() {
		System.out.println("lunch box");
		
	}

	@Override
	public void color() {
		System.out.println("blue");
		
	}

	@Override
	public void brand() {
		System.out.println("milton");
		
	}

	@Override
	public void size() {
		System.out.println("medium");
		
	}

	@Override
	public void shape() {
		System.out.println("oval shape");
		
	}
	
	public boolean heavy() {
		System.out.println("it is heavy");
		return false;
	}

}

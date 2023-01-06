package com.xworkz.alltopics.abstraction.thing;

public abstract class Book {
	
	
	public int pages;
	
	public void write(int pages) {
		pages=100;
		
	}
	
	public abstract void read(int pages) ;

}

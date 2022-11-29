package com.xworkz.interfaces.book;

public class NoteBook implements Book {

	@Override
	public void bookSize() {
		System.out.println("kingSize");
		
	}

	@Override
	public void typeOfBook() {
		System.out.println("notebook");
		
	}

	@Override
	public void numberOfPages() {
		System.out.println("100 pages");
		
	}

	@Override
	public void brandName() {
		System.out.println("vidya");
		
	}

	@Override
	public void price() {
		System.out.println("25 rupees");
		
	}
	
	public boolean isGoodQuality() {
		System.out.println("pages are of good quality");
		return true;
	}

}

package com.xworkz.interfaces.book.boot;

import com.xworkz.interfaces.book.Book;
import com.xworkz.interfaces.book.NoteBook;

public class NoteBookRunner {

	public static void main(String[] args) {
		
		NoteBook note=new NoteBook();
		note.bookSize();
		note.brandName();
		note.isGoodQuality();
		note.numberOfPages();
		note.price();
		note.isGoodQuality();
		
		
		Book book=new NoteBook();
		book.bookSize();
		book.brandName();
		book.numberOfPages();
		book.price();
		book.typeOfBook();
		

	}

}

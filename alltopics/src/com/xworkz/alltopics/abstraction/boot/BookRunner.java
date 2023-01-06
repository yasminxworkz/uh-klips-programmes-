package com.xworkz.alltopics.abstraction.boot;



import com.xworkz.alltopics.abstraction.thing.Book;
import com.xworkz.alltopics.abstraction.thing.NoteBook;

public class BookRunner {

	public static void main(String[] args) {
	Book b=new NoteBook();
	b.read(100);// these two are called from parent class
	b.write(200);
	
	
	NoteBook n=new NoteBook();
	n.read(300);// abstract method from parent should be implemented in sublclass and called from subclass.
	n.write(400); // the method of parent class internally gets overrided in subclass. 
	              
	System.out.println();
   
	}

}

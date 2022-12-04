package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.constructor.*;


public class CollegeLibrariesRunner {

	public static void main(String[] args) {
		
		
		
		LibraryRules rule=new ReadersRules();
		CollegeLibraries library=new CollegeLibraries(rule);
		library.inspection();

	}

}

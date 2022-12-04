package com.xworkz.abstraction.constructor;

public class CollegeLibraries {
	
	private LibraryRules rules;

	public CollegeLibraries(LibraryRules rules) {
		super();
		this.rules = rules;
	}
	
	public void inspection() {
		if(rules!=null) {
			int visit=this.rules.visitingHours();
			boolean silence=this.rules.maintainSilence();
			if(visit>9 && silence==true) {
				System.out.println("reader is following the rules of library");
			}
			else {
				System.out.println("reader is breaking the rules of library");
			}
		}
	}

}

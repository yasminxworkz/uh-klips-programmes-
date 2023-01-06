package com.xworkz.exceptions.repository;


import com.xworkz.exceptions.exception.pointingToNullException;

public class SweetNames implements Sweets {
	
	String sweet;

	@Override
	public void sweetNames(String names) {
		sweet=names;
		
		
		if(names==null) {
			throw new pointingToNullException();
		}
		System.out.println(names);
		System.out.println(names.length());

		
		
			}

}

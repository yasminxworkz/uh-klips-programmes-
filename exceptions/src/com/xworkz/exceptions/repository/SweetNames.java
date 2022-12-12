package com.xworkz.exceptions.repository;


import com.xworkz.exceptions.exception.pointingToNullException;

public class SweetNames implements Sweets {
	String sweet=new String();

	@Override
	public void sweetNames(String names) {
		// TODO Auto-generated method stub
		this.sweet=names;
		System.out.println(sweet);
		if(sweet==null) {
			throw new pointingToNullException();
		}
	}

}

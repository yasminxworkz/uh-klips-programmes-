package com.xworkz.exceptions.repository;

import com.xworkz.exceptions.exception.ArraySizeExceededCantStoreMoreEmails;

public class StoringEmail implements Email {
	
	String[]emails=new String[10];
	int index=0;

	@Override
	public void storeEmail(String email) {
		// TODO Auto-generated method stub
		this.emails[index]=email;
		index++;
		System.out.println("nkankank"+index);
		if(index>=emails.length) {
			throw new ArraySizeExceededCantStoreMoreEmails();
		}
		
	}

}

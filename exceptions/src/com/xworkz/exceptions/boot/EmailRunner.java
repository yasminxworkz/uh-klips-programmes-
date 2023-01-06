package com.xworkz.exceptions.boot;

import com.xworkz.exceptions.repository.StoringEmail;

public class EmailRunner {

	private static Object String;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StoringEmail storingEmail=new StoringEmail();
		storingEmail.storeEmail("yasminkazi96@gmail.com");
		storingEmail.storeEmail("yasminkazi96@gmail.com");
		storingEmail.storeEmail("yasminkazi96@gmail.com");
		storingEmail.storeEmail("yasminkazi96@gmail.com");
		storingEmail.storeEmail("yasminkazi96@gmail.com");
		storingEmail.storeEmail("yasminkazi96@gmail.com");
		storingEmail.storeEmail("yasminkazi96@gmail.com");
		storingEmail.storeEmail("yasminkazi96@gmail.com");
		storingEmail.storeEmail("yasminkazi96@gmail.com");
		try {
			storingEmail.storeEmail("yasminkazi96@gmail.com");
			storingEmail.storeEmail("yasminkazi96@gmail.com");
			storingEmail.storeEmail("yasminkazi96@gmail.com");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
		
		

}



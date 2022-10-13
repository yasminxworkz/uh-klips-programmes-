package com.xworkz.taskToday.boot;

import com.xworkz.taskToday.constructor.Bread;

public class BreadRunner {

	public static void main(String[] args) {
		
		Bread bread=new Bread("brown bread");
		System.out.println("invoking the parameterized constructor with different parameters");
		System.out.println("type: "+ bread.type);
		System.out.println("shape: "+ bread.shape);
		System.out.println("price: "+ bread.price);
		System.out.println("quantity: "+ bread.quantity);
		System.out.println("company name: "+ bread.companyName);

		bread=new Bread(90);
		System.out.println("invoking the parameterized constructor with different parameters");
		System.out.println("type: "+ bread.type);
		System.out.println("shape: "+ bread.shape);
		System.out.println("price: "+ bread.price);
		System.out.println("quantity: "+ bread.quantity);
		System.out.println("company name: "+ bread.companyName);

		bread=new Bread(16,90d);
		System.out.println("invoking the parameterized constructor with different parameters");
		System.out.println("type: "+ bread.type);
		System.out.println("shape: "+ bread.shape);
		System.out.println("price: "+ bread.price);
		System.out.println("quantity: "+ bread.quantity);
		System.out.println("company name: "+ bread.companyName);

		bread=new Bread(16," Nestle");
		System.out.println("invoking the parameterized constructor with different parameters");
		System.out.println("type: "+ bread.type);
		System.out.println("shape: "+ bread.shape);
		System.out.println("price: "+ bread.price);
		System.out.println("quantity: "+ bread.quantity);
		System.out.println("company name: "+ bread.companyName);

		bread=new Bread("amul",8); 
		System.out.println("invoking the parameterized constructor with different parameters");
		System.out.println("type: "+ bread.type);
		System.out.println("shape: "+ bread.shape);
		System.out.println("price: "+ bread.price);
		System.out.println("quantity: "+ bread.quantity);
		System.out.println("company name: "+ bread.companyName);

		bread=new Bread("amul",8,120d);
		System.out.println("invoking the parameterized constructor with different parameters");
		System.out.println("type: "+ bread.type);
		System.out.println("shape: "+ bread.shape);
		System.out.println("price: "+ bread.price);
		System.out.println("quantity: "+ bread.quantity);
		System.out.println("company name: "+ bread.companyName);

		bread=new Bread(8,120d);
		System.out.println("invoking the parameterized constructor with different parameters");
		System.out.println("type: "+ bread.type);
		System.out.println("shape: "+ bread.shape);
		System.out.println("price: "+ bread.price);
		System.out.println("quantity: "+ bread.quantity);
		System.out.println("company name: "+ bread.companyName);

		bread=new Bread("brown bread","square",18,180d,"Amul");
		System.out.println("invoking the parameterized constructor with different parameters");
		System.out.println("type: "+ bread.type);
		System.out.println("shape: "+ bread.shape);
		System.out.println("price: "+ bread.price);
		System.out.println("quantity: "+ bread.quantity);
		System.out.println("company name: "+ bread.companyName);

	}

	}



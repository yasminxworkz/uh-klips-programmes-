package com.xworkz.practice.methods.runner;

import com.xworkz.practice.methods.methodsconstructor.Methods;

public class MethodsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methods calc = new Methods();
		
		System.out.println("The addition of 2 number is : "+calc.add(30, 20)); //------intialised using implicit referene;
		
		System.out.println("can give value or initialise by either of the methods");
		
		double res = calc.add(10.2, 20.1);//
		System.out.println("The addition of 2 number is : "+res);   //-----------------intialised using explicit referene;
		
		
	}

}

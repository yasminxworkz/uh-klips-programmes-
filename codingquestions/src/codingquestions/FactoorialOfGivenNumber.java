package com.xworkz.practice;

public class FactoorialOfGivenNumber {

	public static void main(String[] args) {
		
		int n=4;
		int fac=1;
		
		while(n>0) {
		fac=fac*n;
		n=n-1;
		}
		
		System.out.println(fac);
		
		System.out.println("*******************************************or************************************************");
		
		int number = 8;
		int factorial=1;

		for (int i =1 ; i <= number; i++) {
			
			factorial=factorial*i;
		
		}
		
		System.out.println("factorial of "+number+" is "+factorial);
	}

}

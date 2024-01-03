package com.xworkz.practice;

public class NoOfDigits {
	
	public static void main(String[] args) {

		int num=38657;
		int count=0;
		
		while(num!=0)
		{
			num=num/10;
			count++;
			
		}
		System.out.println("the digits in givne number is : "+count);
	}


}

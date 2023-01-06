package com.xworkz.practice;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int count;
		int j;
		for(i=1;i<=100;i++) {
			count=0;
			for(j=1;j<=i;j++) {
				if(i%j==0)
					count++;
				}
			if(count==2) {
				System.out.println(i);	
			}
		}
		
		
		
		
		System.out.println("---------------------logic to check number is prime or not------------------");
		
		int no=6;
		int temp=0;
		for(int k=1;k<=no;k++)
		{if (no%k==0) {
			temp++;
		}
		
			}
		if(temp==2) {
			System.out.println("is prime");
		}
			else {
				System.out.println("is not prime");
		}
			
		
	}
		


}

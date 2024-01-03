package com.xworkz.practice;

public class Creant {

	public static void main(String[] args) {
		
		String s="this is String";
		
		char s3;
		
		char[] s2=s.toCharArray();
		
		for(int i=s2.length-1;i>=0;i--) {
		
			s3=s2[i];
			System.out.print(s3);
		}
		
		int count=0;
		
		int n=2;
		for(int j=1; j<=100;j++) {
			
				if(n%j==0) {
					count++;
				}
			
		}
		
		if(count==2) {
			System.out.println("the number is prime");
		}
		
		else {
			System.out.println("the number is not prime");
		}
		
		int c;
		int k;
		int l;
		for( k=1;k<=100;k++) {
			c=0;
			for( l=1;l<=k;l++) {
				if(k%l==0) 
					c++;
				
				
			}
			if(c==2) {
				System.out.println(k);
			
		}
		}
		
		
	}

}

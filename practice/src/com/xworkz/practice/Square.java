package com.xworkz.practice;

public class Square {

	public static void main(String[] args) {
		
		int count=0;
		
		for(int i=0;i<=5;i++) {
			for(int j=5;j>=i;j--)
			{
			System.out.print(j);
			
			
		}
			System.out.println(i);
		}
		
		System.out.println("***********************************************************************************************");
		
		for(int i=5;i>=1;i--) {
			for(int j=5;j>=i;j--)
			{
			System.out.print(j);
			
			
		}
			System.out.println(i);
		}
		
		for(int i=0;i<=5;i++) {
			for(int j=1;j<=5;j++)
				if(i==2&j==4){
			{
			System.out.print("*");
			
			
		}
			System.out.println("&");
		}
		}
		
	}

}

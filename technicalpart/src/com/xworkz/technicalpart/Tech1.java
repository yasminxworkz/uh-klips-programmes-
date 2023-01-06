package com.xworkz.technicalpart;

public class Tech1 {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++) {
			System.out.print(" * ");
			
		}
		
		for(int i=0;i<=5;i++) {
			System.out.println(" * ");
			
		}
		
		System.out.println("***************************   Example--1  ****************************************");
		
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=3;j++) {   //square
				System.out.print("@");
				
			}
			System.out.println(" ");
		}
		
		System.out.println("*****************************  Example--2  **************************************");

		for(int i=1;i<=3;i++) {      //printing row values
			for(int j=0;j<=3;j++) {
				System.out.print(i);
				
			}
			System.out.println("");
		}
		System.out.println("******************************  Example--3  *************************************");//i=rows; j=columns
		

		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(j==3)
				System.out.print("Y");
				
			}
			System.out.println(" ");
		}
		System.out.println("********************************* Example--4  **********************************");
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
			
				System.out.print(j);
				
			}
			System.out.println(" Y ");
		}
		System.out.println("**********************************  Example--5  *********************************");
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(j==3) {
				System.out.print(" D ");
				}
				else {
					System.out.print(i);
				}
				
			}
			System.out.println(" ");
		}
		
		System.out.println("******************************  Example--6  ************************************");
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(j==2) {
				System.out.print(" jass ");
				}
				else {
					System.out.print(i);
				}
				
			}
			System.out.println(" ");
		}
		
		System.out.println("*********************************  Example--7  ************************************");
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(i==2&&j==3) {
				System.out.print("jass");
				}
				else {
					System.out.print(" "+i+" ");
				}
				
			}
			System.out.println(" ");
			
		}
		
		System.out.println("*******************************  Example--8  **********************************");
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" Y ");
		}
		System.out.println();
	}
		
		System.out.println("****************************  Example--9  *************************************");
			for(int i=0;i<=4;i++) {
				for(int j=4;j>=i;j--) {
					System.out.print(" me ");
			}
			System.out.println();
		}
			
			System.out.println("******************  OR  ********************");//
			for(int i=0;i<=4;i++) {
				for(int j=i;j<=4;j++) {
					System.out.print(" me ");
			}
			System.out.println();
		}
	}
}

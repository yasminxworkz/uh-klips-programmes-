package com.xworkz.practice;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int x=0;
		int y=1;
		int z=0;
		int n=10;
		int term=1;
		
		while(z<=n) {
			System.out.println(z);
			x=y;
			y=z;
			z=x+y;
			term=term+1;
		}
		
		System.out.println("****************************************or**************************************************");
		
		

			int firstFibonacci = 0;
			int secondFibonacci = 1;
			System.out.println("0 fibonacci "+firstFibonacci);
			System.out.println("1 fibonacci "+secondFibonacci);



			int fibonacci;

			for (int i = 2; i < 20; i++) {

				fibonacci = firstFibonacci + secondFibonacci;
				System.out.println(i + " fibonacci " + fibonacci);

				firstFibonacci = secondFibonacci;
				secondFibonacci = fibonacci;

			}

	}

}

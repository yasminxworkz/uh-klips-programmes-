package com.xworkz.practice;

public class Total {

	public static void main(String[] args) {
		int n=8;
		int add=0;
		int i=0;
		while(i<=n) {
			add=add+i;
			i=i+1;  //////for natural numbers
			//i=i+2; for even numbers
			System.out.println(i);
		}
		System.out.println("sum = "+add);

	}

}

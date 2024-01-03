package com.xworkz.practice;

public class ProductOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=286;
		int pro=1;
		while(n>0) {
			pro=pro * (n%10);
			
			n=n/10;
		}
		System.out.println(pro);
	}

}

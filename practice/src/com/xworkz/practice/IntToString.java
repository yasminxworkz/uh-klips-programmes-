package com.xworkz.practice;

public class IntToString {

	public static void main(String[] args) {
		
		int i=400;
		String s=String.valueOf(i);
		System.out.println(i+100); //500 because + is binary plus operator
		System.out.println(s+100);//400100 because + is String concatenation operator

	}

}

package com.xworkz.practice;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		String str="gadag";
		int len=str.length();
		char[]s=str.toCharArray();


		for (int i = 0; i < s.length; i++) {

			for (int j = i + 1; j < s.length; j++) {

				if (s[i] == s[j]) {

					System.out.println(s[j]);

				}

			}

		}
		
	}
	
}
package com.xworkz.practice;

public class SpaceCount {
	
	public static void main(String[] args) {

		String ref = "java is a high level";
		int count = 0;
		int len = ref.length();

		char[] ref1 = ref.toCharArray();

		for (int i = 0; i < ref1.length; i++) {

			if (ref1[i] == ' ') {
				count++;
			}

		}
		System.out.println("count " + count);

		count = 0;

		/*************** OR ***********/
		for (int i = 0; i < len; i++) {
			if (ref.charAt(i) == ' ') {
				count++;
			}

		}
		System.out.println("count " + count);

	}

}

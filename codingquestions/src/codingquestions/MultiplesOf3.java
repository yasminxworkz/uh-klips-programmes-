package com.xworkz.practice;

public class MultiplesOf3 {
	
	public static void main(String[] args) {

		int numbers[] = { 1, 6, 8, 9, 12, 18, 2, 4, 69 };

		for (int i = 0; i < 50; i++) {

			for (int j = 0; j < numbers.length; j++) {

				if ((3 * i) == numbers[j]) {
					System.out.println(numbers[j]);
				}
			}
		}
	}

}

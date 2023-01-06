package com.xworkz.practice;

public class DuplicatesInArray {
	
	public static void main(String[] args) {

		int[] arr = { 2, 6, 2, 7, 5, 8, 2, 5, 6, 6 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {

					System.out.println(arr[j]);

				}

			}

		}

	}

}

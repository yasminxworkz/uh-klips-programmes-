package com.xworkz.practice;

public class Array2D {

	public static void main(String[] args) {

		int a[][] = { { 23, 45, 45 }/*index 0*/, { 2, 34, 5 }/*index 1*/, { 35, 67, 98 } };

		for (int i = 0; i < a.length; i++) {// indicates which sub array to print

			for (int j = 0; j < a[i].length; j++) {

				System.out.print(a[i][j]);// indicates array of i index and j element in array
			}

			System.out.println();

		}

	}
}

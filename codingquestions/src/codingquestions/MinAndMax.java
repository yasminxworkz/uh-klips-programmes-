package com.xworkz.practice;

public class MinAndMax {

	public static void main(String[] args) {
		
		int[] nums = { 5, 8, 6, 7, 10, 6, 36, 9, 2 };
		int min = nums[0];
		int max = nums[0];

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] < min) {
				min = nums[i];
			
			}

			if (nums[i] > max) {
				max = nums[i];
			}
			

		}
		System.out.println("smallest " + min);
		System.out.println("biggest " + max);
            
		
		
	
			}
	
		

		
		

	

}

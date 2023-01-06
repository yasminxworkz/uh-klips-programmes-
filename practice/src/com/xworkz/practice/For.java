package com.xworkz.practice;

public class For {

	public static void main(String[] args) {
		
			
			System.out.println("------------forward direction---------------");
			int[]arr= {15,12,13,14,16,9,18,20,35,65,89,87};   
			
			for(int i = 0; i< arr.length;i++)    //-----------------------Using for loop, we can traverse in an array in forward direction.
			{
			System.out.println(arr[i]);
			}

			System.out.println("-----------------------backward direction----------------------");
			for(int i = arr.length-1; i >= 0;i--)  //-----------------------: Using for loop, we can also traverse in an array in backward direction.
			{
			System.out.println(arr[i]);
			}
			
			System.out.println("----------------------partially i.e.,in any direction----------------------");
			for(int i = 3; i < arr.length-5;i ++)       //-------------------- Using for loop, we can traverse partially in an array.
			{
			System.out.println(arr[i]);
			}
			
			System.out.println("--------------enhanced for loop-------------");
			for(int i : arr)                   //-----------------------Using enhanced for loop, we can traverse in an array only in forward direction.
			{
			System.out.println(i);
			}
			
			System.out.println("--------------enhanced for loop for string type example-------------");
			String[]s= {"geeta","babita","Seeta","lata"};
			for(String i : s)                   //-----------------------Using enhanced for loop, we can traverse in an array only in forward direction.
			{
			System.out.println(i);
			}

		}
		
		

	}



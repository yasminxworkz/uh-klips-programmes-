package com.xworkz.practice;

public class ReverseAndPAlindromeCheck {

	public static void main(String[] args) {
		
		int n=739;
		int rev=0;
		int z=739;{
			
		}
		while(n>0)
		{
			rev=(rev*10)+ n%10;
			n=n/10;
		}
		System.out.println(rev);
		if (rev==z) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		
		
		
		

	}

}

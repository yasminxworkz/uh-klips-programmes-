package com.xworkz.stringmethods;

public class Palindrome {

	public static void main(String[] args) {
		
		String tripleRide="Triple Riding is a Kannada movie released on 25 Nov, 2022. The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";
         
		String[]words=tripleRide.split(" ");
		for(String word :words) {  //for each loop
			if (isPalindrome(word)) {
				System.out.println(word);
			}
		}

	}
	
	public static boolean isPalindrome(String tripleRide) {
		
		int i1=0;
		int i2=tripleRide.length()-1;
		
		while(i2>i1) {
			if(tripleRide.charAt(i1)!=tripleRide.charAt(i2)) {
				System.out.println("false");
				return false;
				
			}
			i1++;
			i2--;
		}
		return true;
	}

}

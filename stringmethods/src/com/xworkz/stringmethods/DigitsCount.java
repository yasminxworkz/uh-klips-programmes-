package com.xworkz.stringmethods;

public class DigitsCount {

	public static void main(String[] args) {
		String tripleRide="Triple Riding is a Kannada movie released on 25 Nov, 2022. The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";
		char[] chars = tripleRide.toCharArray();
	      StringBuilder sb = new StringBuilder();
	      for(char c : chars){
	         if(Character.isDigit(c)){
	            sb.append(c);
	         }
	      }
	      System.out.println(sb);
		
	}

}

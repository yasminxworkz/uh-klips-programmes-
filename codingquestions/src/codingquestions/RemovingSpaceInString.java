package com.xworkz.practice;

public class RemovingSpaceInString {

	public static void main(String[] args) {
		 String s="cat dog";
		 System.out.println("before removing white space "+s);
		 
		s= s.replace(" ", "");
		 System.out.println("after removing white space "+s);
		 
		 System.out.println("*******************************2nd method*********************************");
		 String st="bottle neck";
		 st=st.replaceAll("\\s+", "");
		 System.out.println(st);
		 

	}

}

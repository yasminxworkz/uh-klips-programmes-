package com.xworkz.practice;

import java.util.HashMap;
import java.util.Scanner;

public class Frequency {

	
		
		
			 public static void main(String[] args) 
		     {  
		        String s = "Gadag"; 
		      s=s.toLowerCase();
		        for(char ch='a'; ch<='z';ch++) {
		        	int c=0;
		        	for(int i=0; i<s.length(); i++) {
		        		if(ch==s.charAt(i)) 
		        			c++;
		        	}
		        	
		        	if(c!=0) {
		        		System.out.println(ch + "= "+c);
		        	}
		        }
	
		     
		     }

}

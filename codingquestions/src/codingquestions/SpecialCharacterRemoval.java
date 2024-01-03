package com.xworkz.practice;

public class SpecialCharacterRemoval {

	public static void main(String[] args) {
		String str="Pr!ogr#am%m*in&g Lan?#guag(e";  
		String resultStr="";  
		//loop execute till the length of the string   
		for (int i=0;i<str.length();i++)  
		{  
		//comparing alphabets with their corresponding ASCII value  
		if (str.charAt(i)>64 && str.charAt(i)<=122) //returns true if both conditions returns true  
		{  
		//adding characters into empty string   
		resultStr=resultStr+str.charAt(i);  
		}  
		
		}  
		System.out.println("String after removing special characters: "+resultStr);  

		
		
		
		
		
	System.out.println("************************************************Using String Method*******************************************");
		

     String st= "This#string%contains^special*characters&.";   
		st = st.replaceAll("[^a-zA-Z0-9]", " ");  
		System.out.println("using replaceAll method.........    "+st);
		
		
		String s = "Hello+-^Java+ -Programmer^ ^^-- ^^^ +!";  
//		s = s.replaceAll("[-+^]*", " ");  
	s=s.replaceAll("\\W", " ") ;   //we can also use this regular expression  
		System.out.println("using replaceAll method.........    "+s);
		
		
		

	}

}

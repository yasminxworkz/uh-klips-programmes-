package com.xworkz.practice;

public class ConsonentAndVowels {
	
	
	
	public static void main(String[]args) {
		
//	String s="Yasmin Khazi";
//	int i;
//	int vol=0; 
//	int con=0;
//			
//	
//	for(i=0;i<s.length();i++) {
//		char c=s.charAt(i);
//		if(c!=' ') {
//			if(c=='a'||c=='e'||c=='i'||c=='0'||c=='u')
//				vol++;
//		}
//		else {
//		if(s.charAt(i) >= 'a' && s.charAt(i)<='z')
//			con++;
//		}
//		
//	}
//	System.out.println("vowels= "+vol+ " consonents= "+con);

	
	
		int vCount = 0, cCount = 0;    
        
        //Declare a string    
        String str = "yasminkhazi";    
            
        //Converting entire string to lower case to reduce the comparisons    
        str = str.toLowerCase();    
            
        for(int i = 0; i < str.length(); i++) {    
            //Checks whether a character is a vowel    
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
                //Increments the vowel counter    
                vCount++;   
                
            }    
            //Checks whether a character is a consonant    
            else if(str.charAt(i) != 'a' || str.charAt(i) != 'e' || str.charAt(i) != 'i' || str.charAt(i) != 'o' || str.charAt(i) != 'u') {      
                //Increments the consonant counter    
                cCount++; 
                
            }    
        }    
        System.out.println("Number of vowels: " + vCount);    
        System.out.println("Number of consonants: " + cCount); 
	
//        str.charAt(i) >= 'a' && str.charAt(i)<='z'
	
	
	
	
	
	
	
	}
}

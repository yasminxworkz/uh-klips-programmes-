package com.xworkz.stringmethods;

public class SplitMethod {

	public static void main(String[] args) {
		String tripleRide="Triple Riding is a Kannada movie released on 25 Nov, 2022. The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";
        
		String[]words=tripleRide.split("\\s");
		for(String g:words) {
			System.out.println(g);
		}
		
		System.out.println("*************************************************         SPLIT BY ,              ***********************************************************8");
		
		String[]words1=tripleRide.split(",");
		for(String g:words1) {
			System.out.println(g);
		}
		
		
		
        System.out.println("*******************************************  to uppercase  **************************************************");
		
		String a=tripleRide.toUpperCase();
		System.out.println(a);
		  
		System.out.println("*************************************  TO LOWERCASE  ******************************************************************");
		
		String s1=tripleRide.toLowerCase();
		System.out.println(s1);
		
	System.out.println("************************************************  STRING TO CHAR ARRAY ****************************************************************************");
		
		
		int count;
		//Converts given string into character array  
		char c[]=tripleRide.toCharArray();
		
		 System.out.println("Duplicate characters in a given string: ");  
	        //Counts each character present in the string  
		 for(int i = 0; i <c.length; i++) {  
	            count = 1;  
	            for(int j = i+1; j <c.length; j++) {  
	                if(c[i] == c[j] && c[i] != ' ') {  
	                    count++;  
	                    //Set string[j] to 0 to avoid printing visited character  
	                    c[j] = '0';  
	                }  
	            }  
	            //A character is considered as duplicate if count is greater than 1  
	            if(count > 1 && c[i] != '0')  
	                System.out.println(c[i]);  
	        }  
		 
		 System.out.println("*******************************************---REVERSE A STRING-----**********************************************************");
		 
		 
		 for(int i=tripleRide.length()-1; i>=0; i--) {
			 System.out.print(tripleRide.charAt(i));
		 }
		 
		 System.out.println("*********************************************************************************************************************8");
		 
		
	}

}

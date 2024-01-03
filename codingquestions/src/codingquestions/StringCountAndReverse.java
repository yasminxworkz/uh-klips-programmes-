package com.xworkz.practice;

public class StringCountAndReverse {

	public static void main(String[] args) {
	
		
		String str = "Brain games";
		 
        int count = 1;
 
        for (int i = 0; i < str.length() - 1; i++)
        {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
            {
                count++;
                System.out.println(count+"***********");
            }
        }
        System.out.println("Number of words in a string : " + count);
		
		for(int k=str.length()-1;k>=0;k--) {
			System.out.println(str.charAt(k)+" --------reverese of a string");
		}
		
		
		String S="space";
		int c=0;
		
		for(int i=0;i<S.length();i++) {
//		c=S.charAt(i);  by using this code it will give the ascii values
			c++;
			
		}
		System.out.println(c+" -----counting of alphabets of a particular string");
		
		
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		int []a= {8,7,6,5,4};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			
			temp++;
			 
		
	}
		System.out.println(temp+"----counting number of digits in a particular array");
		
		for(int j=a.length-1; j>=0; --j) {
			System.out.println(a[j]+" -------reverse of a number");
		}
	}

}

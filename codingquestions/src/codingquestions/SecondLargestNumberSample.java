package com.xworkz.practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondLargestNumberSample {

	public static void main(String[] args) {
		
	
		
		 int[]a= {14,2,12,10};
			int temp;
			
			for (int i = 0; i < a.length; i++)   
			        {  
			            for (int j = i + 1; j < a.length; j++)   
			            {  
			            	for(int k=j+1; k<a.length; k++)
			            	{	if (a[i] <a[j])   
			                {  
			            		if(a[j] <a[k]) {
			                    temp = a[j];  
			                    a[j] = a[k];  
			                    a[k] = temp;  
			                    
			                    System.out.println(a[k]);
			                }  
			               
			                
//			                System.out.println(a[j]);
			            	} } System.out.println(a[i]);
			           
			        
			        }}
			System.out.println(a[1]);
	}
}
			
			       
//if (a[i] <a[j])   
//{  
//    temp = a[i];  
//    a[i] = a[j];  
//    a[j] = temp;  
//}  	   
 

	



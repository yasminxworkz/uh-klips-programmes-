 package com.xworkz.practice;

public class ArmStrongNumberCheck {

	public static void main(String[] args) {
		
//		int n=153;
//		int z;
//		int count=0;
//		int digit;
//		int i;
//		int pro;
//		int sum=0;
//		z=n;
//		
//		while(z>0) {
//			count=count+1;
//			z=z/10;
//			
//			while(z>0) {
//				digit=z%10; pro=1;
//				        for(i=1;i<=count;i++) {
//					     pro=pro*digit;
//					     sum= sum+pro;
//					     z=z/10;
//				}
//		}
//		
//		
//		
//			        if(sum==n) {
//			        	System.out.println("is armstrong number");
//			        }
//			        else {
//			        	System.out.println("not ArmStrong");
//			        }
//		}
		
		
		int n= 153;                         ///9474;       
		int arm=0;
		int rem;
		int c;
		c=n;
		while(n>0) {
			rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
		}
		if(c==arm) {
        	System.out.println("is armstrong number");
        }
        else {
        	System.out.println("not ArmStrong");
        }
	}

}

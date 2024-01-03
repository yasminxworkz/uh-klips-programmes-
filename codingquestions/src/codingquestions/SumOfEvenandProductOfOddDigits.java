package com.xworkz.practice;

public class SumOfEvenandProductOfOddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=2345;
		int sum=0;
		int pro=1;
		int digit;
		
		while(n>0) {
			digit=n%10;
			if(digit%2==0) {
				sum=sum+digit;
			}
			else {
				pro=pro*digit;
			}
			n=n/10;
			
		}
		System.out.println(sum);//-----------------------printing sum of even digits----------
				
		System.out.println(pro);//---------------------printing product of odd digits----------
	}

}

package com.xworkz.practice;

public class DuplicateArray {

	public static void main(String[] args) {
		
		int[]no= {5,5,6,6,7,7,8,8};
		
	
		for(int i=0;i<no.length;i++) {
			for(int j=i+1;j<no.length;j++) {
				if(no[i]==no[j])
					System.out.println("duplicate elements: "+no[j]);
			}
		}
		
		

	}

}

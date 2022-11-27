package com.xworkz.stringmethods;

public class RCount {

	public static void main(String[] args) {
		String tripleRide="Triple Riding is a Kannada movie released on 25 Nov, 2022. The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";
        
		
		int totalCount=tripleRide.length();
		System.out.println(totalCount);
		
		int totalCountAfterRemovingR=tripleRide.replace("R","").length();	
		System.out.println(totalCountAfterRemovingR);
		
		int count=totalCount-totalCountAfterRemovingR;
		System.out.println("Number of R in above sentence is : "+count);

	}

}

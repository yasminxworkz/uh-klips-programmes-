package com.xworkz.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import sun.security.util.ArrayUtil;


public class DuplicatesInArray {
	
	public static void main(String[] args) {

		int[] arr = { 2, 6, 2, 7, 5, 8, 2, 5, 6, 6 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {

					System.out.println(arr[j]);

				}

			}

		}
		
	 int[] ab= {2,3,4,2,3,4,5,6,6,7,8};
	      
	  Set s=new TreeSet(); 
      
      for (int i=0; i<ab.length;i++) {
    	  s.add(ab[i]); 
	}
      
      System.out.println("**************************** removing duplicates using collection *************************************");
      System.out.println(s);
      
      System.out.println(Collections.min(s)+"====== this is the  min value from given set....................");
     System.out.println(Collections.max(s)+"=============== this is the max value from given set.........");
 
}

}

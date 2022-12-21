package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoeSize {

	public static void main(String[] args) {
		int shoeSize1=5;
		int shoeSize2=6;
		int shoeSize3=7;
		int shoeSize4=8;
		int shoeSize5=9;
		int shoeSize6=4;
		int shoeSize7=7;
		int shoeSize8=6;
		int shoeSize9=4;
		int shoeSize10=10;
		int shoeSize11=8;
		int shoeSize12=7;
		int shoeSize13=6;
		int shoeSize14=5;
		int shoeSize15=5;
		
		Collection<Integer> collection=new ArrayList<Integer>();
		
		collection.add(shoeSize10);
		collection.add(shoeSize9);
		collection.add(shoeSize8);
		collection.add(shoeSize7);
		collection.add(shoeSize6);
		collection.add(shoeSize5);
		collection.add(shoeSize4);
		collection.add(shoeSize3);
		collection.add(shoeSize2);
		collection.add(shoeSize1);
		
		System.out.println(collection);
		
		
	
		Iterator<Integer> iterate=collection.iterator();
	
		while(iterate.hasNext()) {
			int soft=iterate.next();
			System.out.println("ShoeSize -- "+soft);
			System.out.println("element exist-- "+iterate.hasNext());
		}

	}

}

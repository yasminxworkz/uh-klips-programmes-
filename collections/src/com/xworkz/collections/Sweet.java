package com.xworkz.collections;

import java.util.Collection;
import java.util.HashSet;

public class Sweet {

	public static void main(String[] args) {
		
	String sweet1="motichoor";
	String sweet2="besan laadu";
	String sweet3="rasmalai";
	String sweet4="rasgulla";
	String sweet5="jalebi";
	String sweet6="jamun";
	String sweet7="kaaju katli";
	String sweet8="kalakandh";
	String sweet9="rabadi";
	String sweet10="dilpasand";
	String sweet11="chum chum";
	String sweet12="jhangir";
	String sweet13="cake";
	
	Collection<String> collection=new HashSet<String>();
	
	collection.add(sweet1);
	collection.add(sweet2);
	collection.add(sweet3);
	collection.add(sweet4);
	collection.add(sweet5);
	collection.add(sweet6);
	collection.add(sweet7);
	collection.add(sweet8);
	collection.add(sweet9);
	collection.add(sweet10);
	collection.add(sweet11);
	collection.add(sweet12);
	collection.add(sweet13);
	
	
	System.out.println(collection);
	int a=collection.size();
	System.out.println("size before clear "+a);
	
	collection.clear();
	a=collection.size();
	System.out.println("size after clear "+a);

	}

}

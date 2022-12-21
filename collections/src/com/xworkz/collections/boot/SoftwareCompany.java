package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class SoftwareCompany {


	public static void main(String[] args) {
		String softwareCompany1="PearlArc Systems Private Limited";
		String softwareCompany2="SrinSoft Technologies";
		String softwareCompany3="Infosys Limited";
		String softwareCompany4="Nortech Infonet Pvt Ltd";
		String softwareCompany5="H B I Software Pvt Ltd";
		String softwareCompany6="Icicle Technologies";
		String softwareCompany7="Wolken Software";
		String softwareCompany8="Zensar Technologies";
		String softwareCompany9="XYKA Software Pvt Ltd";
		String softwareCompany10="Cumulations Technologies";
		String softwareCompany11="cognizant";
		String softwareCompany12="capegemini";
		String softwareCompany13="samsung";
		String softwareCompany14="TechMahindra";
		String softwareCompany15="amazon";
		String softwareCompany16="HCL";
		String softwareCompany17="Cisco";
		String softwareCompany18="mphasis";
		String softwareCompany19="Nokia";
		String softwareCompany20="Robert Bosch";
		
		Collection<String> collection=new ArrayList<String>();
		
		collection.add(softwareCompany10);
		collection.add(softwareCompany9);
		collection.add(softwareCompany8);
		collection.add(softwareCompany7);
		collection.add(softwareCompany6);
		collection.add(softwareCompany5);
		collection.add(softwareCompany4);
		collection.add(softwareCompany3);
		collection.add(softwareCompany2);
		collection.add(softwareCompany1);
		
		System.out.println(collection);
		
		
	
		Iterator<String> com=collection.iterator();
	
		while(com.hasNext()) {
			String soft=com.next();
			System.out.println("name of the element -- "+soft);
			System.out.println("element exist "+com.hasNext());
		}
		
		
		
	}

}

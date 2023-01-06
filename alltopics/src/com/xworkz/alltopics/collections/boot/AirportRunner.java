package com.xworkz.alltopics.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.alltopics.collections.dto.AirportDTO;

public class AirportRunner {

	public static void main(String[] args) {
		AirportDTO flight1=new AirportDTO("rajivgandhi", "hyderabad", 500);
		AirportDTO flight2=new AirportDTO("lokpriyaGopinath", "assam", 600);
		AirportDTO flight3=new AirportDTO("gaya", "bihar", 550);
		AirportDTO flight4=new AirportDTO("indiragandhi", "delhi", 500);
		AirportDTO flight5=new AirportDTO("cochin", "kerala", 300);
		AirportDTO flight6=new AirportDTO("guru ramdas", "punjab", 400);
		
		List<AirportDTO> collect=new ArrayList<AirportDTO>();
		collect.add(flight1);
		collect.add(flight2);
		collect.add(flight3);
		collect.add(flight4);
		collect.add(flight5);
		
		System.out.println(collect.contains(flight6));
		
		Iterator<AirportDTO> iter=collect.iterator();
		while(iter.hasNext()) {
			AirportDTO a=iter.next();
			System.out.println(a);
		}
		
		System.err.println("*****************************************************************************");
		collect.stream().filter((p)->p.getLocation()=="bihar").map(m->m.getName()).collect(Collectors.toSet()).forEach(f->System.out.println(f.toUpperCase()));

		collect.stream().filter((p)->p.getLocation()=="bihar").collect(Collectors.toSet()).forEach(f->System.out.println(f));

		
		System.err.println("******************************************");
		Comparator<AirportDTO> comp=(a1,a2)->Integer.compare(a1.getNoOfPassengers(),a2.getNoOfPassengers());
		collect.stream().sorted(comp).forEach(e->System.out.println(e));
		
		System.err.println("**************************************************************");
		Comparator<AirportDTO> co=(b1,b2)->b1.getName().compareToIgnoreCase(b2.getName());
		collect.stream().sorted(co).forEachOrdered(e->System.out.println(e));
	}

}

package com.xworkz.encapsulation.perfume.boot;

import com.xworkz.encapsulation.perfume.constructor.Perfume;
import com.xworkz.encapsulation.perfume.constructor.Store;

public class StoreRunner {

	public static void main(String[] args) {
		
		Perfume perfume=new Perfume();
		
		Store angadi=new Store();
		perfume.getBrand();
		angadi.setPerfume();
		angadi.use();
		
		
		
				

	}

}

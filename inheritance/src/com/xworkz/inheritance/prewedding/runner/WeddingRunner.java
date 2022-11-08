package com.xworkz.inheritance.prewedding.runner;

import com.xworkz.inheritance.prewedding.constructor.Prewedding;
import com.xworkz.inheritance.prewedding.constructor.Wedding;

public class WeddingRunner {

	public static void main(String[] args) {
		Wedding wed=new Prewedding("sunday", "haldiceremony", 100);
		System.out.println(wed.day);
		System.out.println(wed.photoShootType);
		System.out.println(wed.noOfPhotos);

	}

}

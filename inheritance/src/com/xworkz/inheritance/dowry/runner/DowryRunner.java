package com.xworkz.inheritance.dowry.runner;

import com.xworkz.inheritance.dowry.constructor.Crime;
import com.xworkz.inheritance.dowry.constructor.Dowry;

public class DowryRunner {

	public static void main(String[] args) {
		Dowry dahej=new Crime(50000, 5, false);
		System.out.println(dahej.money);
		System.out.println(dahej.imprisonment);
		System.out.println(dahej.isLegal);

	}

}

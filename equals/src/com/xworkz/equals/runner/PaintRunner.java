package com.xworkz.equals.runner;

import com.xworkz.equals.contructor.Paint;

public class PaintRunner {

	public static void main(String[] args) {
		
		Paint rang=new Paint("asianpaints", "oilpaint", "chemical", "pune", "yellow", "cylindrical", 2020, 1, 550, false);
		System.out.println(rang);
		
		Paint rang1=new Paint("deluxe", "emulsion", "chemical", "mumbai", "blue", "cylindrical", 2021, 4, 3000, false);
		System.out.println(rang1);
		
		boolean paint=rang.equals(rang1);
		System.out.println(paint);

	}

}

package com.xworkz.interfaces.shirt.boot;

import com.xworkz.interfaces.shirt.Clothes;
import com.xworkz.interfaces.shirt.TShirt;

public class TShirtRunner {

	public static void main(String[] args) {
		TShirt shirt=new TShirt();
		shirt.brand("polo");
		shirt.color("blue");
		shirt.noOfPieces(4);
		shirt.size("L");
		shirt.type();
		shirt.type("Tshirt");
		shirt.isgood();
		
		
		Clothes cloth=new TShirt();
		cloth.brand("nike");
		cloth.color("yellow");
		cloth.size("XL");
		cloth.type();
		cloth.type("cotton");
		cloth.noOfPieces(6);
	

	}

}

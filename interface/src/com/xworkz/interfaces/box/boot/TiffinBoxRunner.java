package com.xworkz.interfaces.box.boot;

import com.xworkz.interfaces.box.Box;
import com.xworkz.interfaces.box.TiffinBox;

public class TiffinBoxRunner {

	public static void main(String[] args) {
		TiffinBox tiffin=new TiffinBox();
		tiffin.brand();
		tiffin.color();
		tiffin.shape();
		tiffin.size();
		tiffin.type();
		tiffin.heavy();
		
		Box lunch=new TiffinBox();
		lunch.brand();
		lunch.color();
		lunch.shape();
		lunch.size();
		lunch.type();

	}

}

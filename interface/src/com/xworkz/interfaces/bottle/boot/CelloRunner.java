package com.xworkz.interfaces.bottle.boot;

import com.xworkz.interfaces.bottle.Bottles;
import com.xworkz.interfaces.bottle.Cello;

public class CelloRunner {

	public static void main(String[] args) {
		Cello cell=new Cello();
		cell.brand();
		cell.color();
		cell.isComfort();
		cell.quantity();
		cell.shape();
		cell.type();
		
		Bottles bot=new Cello();
		bot.brand();
		bot.color();
		bot.quantity();
		bot.shape();
		bot.type();

	}

}

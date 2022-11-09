package com.xworkz.inheritance.shoppingmall.runner;

import com.xworkz.inheritance.shoppingmall.constructor.Orion;
import com.xworkz.inheritance.shoppingmall.constructor.ShoppingMall;

public class ShoppingMallRunner {

	public static void main(String[] args) {
		ShoppingMall mall=new Orion("bangalore", 10000, true);
		mall.display();
	}

}

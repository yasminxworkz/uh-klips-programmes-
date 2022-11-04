package com.xworkz.encapsulation.shoe.runner;

import com.xworkz.encapsulation.shoe.constructor.Shoe;
import com.xworkz.encapsulation.shoe.constructor.ShoeShop;

public class ShoeShopRunner {

	public static void main(String[] args) {
		
		Shoe shoe=new Shoe();
		ShoeShop shop=new ShoeShop();
		shop.setShoe();
		shoe.getMaterial();
		shoe.getColor();
		shoe.getOwner();
		shoe.getPrice();
		shoe.getValidity();
		shoe.isComfort();
		shop.use();
		
		

	}

}

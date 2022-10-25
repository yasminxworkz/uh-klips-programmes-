package com.xworkz.tasktoday.boot;

import com.xworkz.tasktoday.constructor.Sweet;

public class SweetRunner {

	public static void main(String[] args) {
		
		Sweet mithaai=new Sweet(480);
		mithaai.setQuantity();
		Sweet.color="orange";
		mithaai.shopName="Mishra";
		mithaai.display();

	}

}

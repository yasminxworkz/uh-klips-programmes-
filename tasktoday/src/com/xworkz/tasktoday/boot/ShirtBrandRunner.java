package com.xworkz.tasktoday.boot;

import com.xworkz.tasktoday.constructor.ShirtBrand;

public class ShirtBrandRunner {

	public static void main(String[] args) {
		
		ShirtBrand shirtBrand=new ShirtBrand("maroon");
		shirtBrand.companyRevenue=500000000000l;
		ShirtBrand.shirtPrice=2500;
		shirtBrand.setBrandName();
		shirtBrand.display();
		
		

	}

}

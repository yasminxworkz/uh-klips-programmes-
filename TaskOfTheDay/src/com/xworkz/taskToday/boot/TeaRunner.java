package com.xworkz.taskToday.boot;

import com.xworkz.taskToday.constructor.Tea;

public class TeaRunner {

	public static void main(String[] args) {
		
		Tea tea=new Tea();
		System.out.println("values assigned using literals-------------------------------------");
		System.out.println(tea.brand);
		System.out.println(tea.name);
		System.out.println(tea.type);
		System.out.println(tea.price);
		System.out.println(tea.quantity);
		System.out.println(tea.packagingMaterial);
		System.out.println(tea.bestBefore);
		System.out.println(tea.manufacturingYear);
		System.out.println(tea.cultivatedIn);
		System.out.println(tea.packed);
		
		System.out.println("values assigned using instantiation----------------------------------");
		tea.specialIngredient="ginger";
		tea.preparingProcedures=4;
		tea.color="black";
		tea.companyFounder="James Finlay";
		tea.physicalProperty="granules";
		tea.appearance="dry";
	    tea.mostConsumingAt="turkey";		
		
	    System.out.println(tea.fermented);
		System.out.println(tea.specialIngredient);
		System.out.println(tea.preparingProcedures);
		System.out.println(tea.color);
		System.out.println(tea.companyFounder);
		System.out.println(tea.physicalProperty);
		System.out.println(tea.appearance);
		System.out.println(tea.mostConsumingAt);
		
	   
		
		
		
	

	}

}

package com.xworkz.crudss.boot;

import com.xworkz.crudss.constant.PizzaSize;
import com.xworkz.crudss.dto.PizzaDTO;
import com.xworkz.crudss.service.PizzaServiceImp;

public class PizzaRunner {

	public static void main(String[] args) {
		PizzaDTO pizza=new PizzaDTO();
		PizzaServiceImp serve=new PizzaServiceImp();
		
		pizza.setPrice(60);
		pizza.setName("cheeese");
		pizza.setType("veg");
		pizza.setCompany("dominosssss");
		pizza.setFlavour("alpinos");
		pizza.setSize(PizzaSize.MEDIUM);
		pizza.setCheese(true);
		serve.validateAndSave(pizza);
		

	}

}


package com.xworkz.crudss.service;

import com.xworkz.crudss.constant.PizzaSize;
import com.xworkz.crudss.dto.PizzaDTO;

public class PizzaServiceImp implements PizzaService{
	
	String name;
      
	@Override
	public boolean validateAndSave(PizzaDTO dto) {
		if(dto!=null && dto.getPrice()>=50 && dto.getPrice()<=12000) {
			System.out.println("pizza is valid : "+dto.getPrice());
			System.out.println(dto);
			
			
		}
		else {
			System.out.println("not valid pizza");
		}
		
		if(dto!=null && dto.getName().length()>=5 && dto.getName().length()<=12) {
			System.out.println("pizza name is valid : "+dto.getName());
			System.out.println(dto);
			
			
		}
		else {
			System.out.println("not valid pizza : "+dto.getName());
		}
		
		if(dto!=null && dto.getCompany().length()>=8 && dto.getCompany().length()<=20) {
			System.out.println("pizza is valid : "+dto.getCompany());
			System.out.println(dto);
			
		}
		else {
			System.out.println("not valid pizza" +dto.getCompany());
		}
		

		if(dto!=null && dto.getFlavour().length()>=3 && dto.getFlavour().length()<=20) {
			System.out.println("pizza is valid"+dto.getFlavour());
			System.out.println(dto);
			
			
		}
		else {
			System.out.println("not valid pizza : "+dto.getFlavour());
		}
		
		
		if(dto!=null ||dto.getType()=="Veg") {
			System.out.println("this is Cheesy Vegetable Pizza . pizza  is valid : "+dto.getType());
			System.out.println(dto);
			
			
		}
		else  {
			System.out.println("this is Classic Chicken Pizza . pizza  is valid : "+dto.getType());
		}
		
		if(dto!=null || dto.getSize()==PizzaSize.LARGE||dto.getSize()==PizzaSize.SMALL||dto.getSize()==PizzaSize.MEDIUM) {
			System.out.println("pizza is valid : "+dto.getSize());
			System.out.println(dto);
			
			
		}
		else {
			System.out.println("not valid pizza : "+dto.getSize());
		
		}
		
		if(dto!=null||dto.isCheese()==true) {
			System.out.println("Presence of cheese is true.Pizza  is valid : "+dto.isCheese());
			System.out.println(dto);
		}
		else {
			System.out.println("invalid pizza : "+dto.isCheese());
		}
		
		return false;
	}

	}


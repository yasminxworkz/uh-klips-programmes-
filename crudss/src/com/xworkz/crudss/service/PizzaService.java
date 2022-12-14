package com.xworkz.crudss.service;

import com.xworkz.crudss.dto.PizzaDTO;

public interface PizzaService {
	
	boolean validateAndSave(PizzaDTO dto);

}

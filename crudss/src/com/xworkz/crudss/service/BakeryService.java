package com.xworkz.crudss.service;

import com.xworkz.crudss.dto.BakeryDTO;

import com.xworkz.crudss.exception.ValidationException;

public interface BakeryService {
	
	boolean validateAndSave(BakeryDTO dto) throws ValidationException;

}

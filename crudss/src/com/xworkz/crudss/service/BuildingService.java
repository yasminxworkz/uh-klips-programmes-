package com.xworkz.crudss.service;

import com.xworkz.crudss.dto.BuildingDTO;

import com.xworkz.crudss.exception.ValidationException;

public interface BuildingService {
	
	boolean validateAndSave(BuildingDTO dto) throws ValidationException;

}

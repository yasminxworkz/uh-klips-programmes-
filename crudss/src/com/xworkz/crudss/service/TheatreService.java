package com.xworkz.crudss.service;

import com.xworkz.crudss.dto.TheatreDTO;
import com.xworkz.crudss.exception.ValidationException;

public interface TheatreService {
	boolean validateAndSave(TheatreDTO dto) throws ValidationException;

}

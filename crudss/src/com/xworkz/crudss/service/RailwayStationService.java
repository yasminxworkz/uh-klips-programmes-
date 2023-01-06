package com.xworkz.crudss.service;

import com.xworkz.crudss.dto.RailwayStationDTO;
import com.xworkz.crudss.exception.ValidationException;

public interface RailwayStationService {
	
	boolean validateandSave(RailwayStationDTO dto) throws ValidationException;

}

package com.xworkz.validation.service;

import com.xworkz.validation.dto.FirstAidDto;

public interface FirstAidsService {

	boolean validateAndSave(FirstAidDto dto);
}

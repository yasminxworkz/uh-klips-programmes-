package com.xworkz.movies.Service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.movies.dto.CMDTO;

public interface CMService {
	Set<ConstraintViolation<CMDTO>> validateAndSave(CMDTO dto);

}

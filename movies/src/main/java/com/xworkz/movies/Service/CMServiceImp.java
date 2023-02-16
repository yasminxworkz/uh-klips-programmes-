package com.xworkz.movies.Service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;


import org.springframework.stereotype.Service;

import com.xworkz.movies.dto.CMDTO;

@Service
public class CMServiceImp implements CMService {

	public CMServiceImp() {
		System.out.println("running CMServiceImp.............");
	}
	
	@Override
	public Set<ConstraintViolation<CMDTO>> validateAndSave(CMDTO dto) {
		System.out.println("running validateAndSave............ ");
		
	ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
	Validator validator=factory.getValidator();
	Set<ConstraintViolation<CMDTO>> constraintViolations=validator.validate(dto);
	
	if(constraintViolations!=null && !constraintViolations.isEmpty()) {
		System.err.println("constraintViolations exist, return constraint");
		return constraintViolations;
	}
	
	else {
		System.out.println("constraintViolations doesnot exist");
		return Collections.emptySet();
	}
		
	}

}

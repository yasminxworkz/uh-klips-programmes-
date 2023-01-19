package com.xworkz.trainee.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;



import com.xworkz.trainee.dto.TraineeDto;

public class TraineeServiceImp implements TraineeService{

	@Override
	public boolean validateAndSave(TraineeDto dto) {
		System.out.println("executing validateandsave start");
		System.out.println("dto passed: "+dto);
		
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		Set<ConstraintViolation<TraineeDto>> violations=validator.validate(dto);
		if(!violations.isEmpty())//i have errors
		{
			System.out.println("Error is there");
			violations.forEach(c-> System.err.println(c.getMessage()));
		}
		
		return false;
		
		
		
	}

}

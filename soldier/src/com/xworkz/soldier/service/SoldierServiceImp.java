package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.soldier.dto.SoldierDto;
import com.xworkz.soldier.repository.SoldierRepoImp;


public class SoldierServiceImp implements SoldierService{
	
	private SoldierRepoImp soldierRepoImp;
	
	public void soldier(SoldierRepoImp soldierRepoImp) {
		this. soldierRepoImp=soldierRepoImp;
	}
	
	public SoldierServiceImp() {
		System.out.println("running soldier service imp");
	}

	@Override
	public boolean validateAndSave(SoldierDto dto) {
		System.out.println("Dto passed: "+dto);
	ValidatorFactory factory=	Validation.buildDefaultValidatorFactory();
	Validator validator=factory.getValidator();
	Set<ConstraintViolation<SoldierDto>> violations=validator.validate(dto);
	if(!violations.isEmpty())//i have errors
		{
			System.out.println("Error is there");
			violations.forEach(c-> System.err.println(c.getMessage()));
		}
	
	else {
		boolean saved=soldierRepoImp.save(dto);
		
		
		return saved;
	}

		return false;
	}

}

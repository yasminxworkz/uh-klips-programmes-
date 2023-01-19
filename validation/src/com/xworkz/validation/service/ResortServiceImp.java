package com.xworkz.validation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.validation.dto.FirstAidDto;
import com.xworkz.validation.dto.ResortDto;
import com.xworkz.validation.repository.ResortRepo;

@Component
public class ResortServiceImp implements ResortService {
     @Autowired
	private ResortRepo repo;
	private Validator validator;
	
	
	@Autowired
	public ResortServiceImp(Validator validator) {
		this.validator = validator;
	}
	
	public void resort(ResortRepo repo) {
		this.repo=repo;
	}



	@Override
	public boolean validateAndSave(ResortDto dto) {
		Set<ConstraintViolation<ResortDto>> violations=validator.validate(dto);
		if(!violations.isEmpty())//i have errors
		{
			System.out.println("Error is there");
			violations.forEach(c-> System.err.println(c.getMessage()));
			return false;
		}
	
	else {
		boolean saved=this.repo.save(dto);
		System.out.println("saved : "+saved);
		return true;
	}
	}

}

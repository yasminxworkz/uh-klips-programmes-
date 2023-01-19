package com.xworkz.validation.service;

import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.xworkz.validation.dto.FirstAidDto;
import com.xworkz.validation.repository.FirstAidRepo;


@Component
public class FirstAidsServiceImp implements FirstAidsService {
	@Autowired
	private FirstAidRepo repo;
	private Validator validator;
	
	@Autowired
	public FirstAidsServiceImp(Validator validator) {
		this.validator=validator;
		
	}
	
	public void repo(FirstAidRepo repo) {
		this.repo = repo;
	}


	@Override
	public boolean validateAndSave(FirstAidDto dto) {
		
		Set<ConstraintViolation<FirstAidDto>> violations=validator.validate(dto);
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

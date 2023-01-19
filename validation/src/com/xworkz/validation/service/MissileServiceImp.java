package com.xworkz.validation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.validation.dto.MissileDto;
import com.xworkz.validation.repository.MissileRepo;
@Component
public class MissileServiceImp implements MissileService {
    @Autowired
	private MissileRepo repo;
    private Validator validator;
    
    @Autowired
	public MissileServiceImp(Validator validator) {
		this.validator = validator;
	}
    
    public void missile(MissileRepo repo) {
    	this.repo=repo;
    }

	
	
	@Override
	public boolean validateAndSave(MissileDto dto) {
		Set<ConstraintViolation<MissileDto>> violations=validator.validate(dto);
		if(!violations.isEmpty()) {
			violations.forEach(e-> System.err.println(e.getMessage()));
		return false;	
		}
		else {
			boolean saved=this.repo.save(dto);
			System.out.println("saved : "+saved);
			return true;
		}
	}

}

package com.xworkz.aeroplane.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.aeroplane.dto.AeroplaneDTO;
import com.xworkz.aeroplane.entity.AeroplaneEntity;
import com.xworkz.aeroplane.repository.AeroplaneRepository;

@Service
public class AeroplaneServiceImp implements AeroplaneService {

	@Autowired
	AeroplaneRepository repo;
	
	public AeroplaneServiceImp() {
		System.out.println("created "+getClass().getSimpleName());
	}
	
	@Override
	public Set<ConstraintViolation<AeroplaneDTO>> validateAndSave(AeroplaneDTO dto) {
		Set<ConstraintViolation<AeroplaneDTO>> violations = Validation.buildDefaultValidatorFactory().getValidator()
				.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("violations present......invalid data");
			return violations;
		}

		System.out.println("no violations present,data can be saved");

		AeroplaneEntity entity = new AeroplaneEntity();
		entity.setName(dto.getName());
		entity.setCompany(dto.getCompany());
		entity.setCost(dto.getCost());
		entity.setCountry(dto.getCountry());
		entity.setType(dto.getType());

		boolean saved = repo.save(entity);
		System.out.println("data saved : " + saved);
		return Collections.emptySet();

	}

	@Override
	public AeroplaneDTO findById(int id) {
		if (id > 0) {
			AeroplaneEntity entity = repo.findById(id);
			if (entity != null) {
				System.out.println("entity is found for id : " + id);
				AeroplaneDTO dto = new AeroplaneDTO();
				dto.setCompany(entity.getCompany());
				dto.setName(entity.getName());
				dto.setCost(entity.getCost());
				dto.setCountry(entity.getCountry());
				dto.setType(entity.getType());
				return dto;

			}
			
			
		}
		return AeroplaneService.super.findById(id);

	


		
	}

}

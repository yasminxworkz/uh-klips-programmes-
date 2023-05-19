package com.xworkz.project.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.enterprise.inject.spi.Bean;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.project.dto.TechnologiesDTO;
import com.xworkz.project.entity.TechnologiesEntity;
import com.xworkz.project.respository.TechnologiesRepo;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class TechnologiesServiceImp implements TechnologiesService {

	
	@Autowired
	TechnologiesRepo repo;
	
	public TechnologiesServiceImp() {
		log.info("Running TechnologiesServiceImp......................");
	}
	
	@Override
	public Set<ConstraintViolation<TechnologiesDTO>> validateAndSave(TechnologiesDTO dto) {
		Set<ConstraintViolation<TechnologiesDTO>> violations=Validation.buildDefaultValidatorFactory().getValidator().validate(dto);
		if(violations!=null && !violations.isEmpty()) {
			System.err.println("violations present ..........invalid data");
			return violations;
		}
		
		
		

		
		log.info("no violations present, dat can be saved");
		TechnologiesEntity entity=new TechnologiesEntity();
		BeanUtils.copyProperties(dto, entity);
		boolean saved=repo.save(entity);
		log.info("data saved"+ saved);
		
		
		return Collections.emptySet();
	}
	
	@Override
	public List<TechnologiesDTO> findAll() {
		List<TechnologiesEntity> entity=this.repo.findAll();
		List<TechnologiesDTO> list= new ArrayList<TechnologiesDTO>();
		for (TechnologiesEntity technologiesEntity : entity) {
			TechnologiesDTO dto=new TechnologiesDTO();
			BeanUtils.copyProperties(technologiesEntity, dto);
			list.add(dto);
		}
		
		log.info("size of dtos "+ list.size());
		log.info("size of entities "+ entity.size());
		return list;
	}

	@Override
	public List<TechnologiesDTO> findByTechnology(String techName) {
		log.info("running findByTechnology in Technologyservice........"+techName);
		if(techName!=null && !techName.isEmpty()) {
			log.info("techName is valid.............calling repo....");
			List<TechnologiesEntity> entities=this.repo.findByTechnology(techName);
			List<TechnologiesDTO> list=new ArrayList<TechnologiesDTO>();
			for (TechnologiesEntity technologiesEntity : entities) {
				TechnologiesDTO dto=new TechnologiesDTO();
				BeanUtils.copyProperties(technologiesEntity, dto);
				list.add(dto);
				
			}
			
			log.info("size of dtos "+list.size());
			log.info("size of entities " +entities.size());
			return list;
		}
		
		else {
			System.err.println("this name is not available..........................");
			return Collections.emptyList();
		}
		
		
		
		
	}
	
	

}

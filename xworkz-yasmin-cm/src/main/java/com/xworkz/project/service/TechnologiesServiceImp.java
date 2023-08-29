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
import com.xworkz.project.entity.ProjectEntity;
import com.xworkz.project.entity.TechnologiesEntity;
import com.xworkz.project.respository.ProjectRepo;
import com.xworkz.project.respository.TechnologiesRepo;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class TechnologiesServiceImp implements TechnologiesService {

	
	@Autowired
	TechnologiesRepo technologiesRepo;
	
	@Autowired
	ProjectRepo projectRepo;
	
	public TechnologiesServiceImp() {
		log.info("Running TechnologiesServiceImp......................");
	}
	
	
	
	@Override
	public List<TechnologiesDTO> findAll() {
		List<TechnologiesEntity> entity=this.technologiesRepo.findAll();
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
	public boolean save(TechnologiesDTO technologiesDTO) {
		System.out.println("========================================"+technologiesDTO.getUserId());

		
		ProjectEntity entity=projectRepo.findByUserId(technologiesDTO.getUserId());
		
		TechnologiesEntity technologiesEntity=new TechnologiesEntity();
		
		BeanUtils.copyProperties(technologiesDTO, technologiesEntity);
		
		technologiesEntity.setProjectEntity(entity);
		
		technologiesRepo.save(technologiesEntity);
		
		return true;
	}



	@Override
	public List<TechnologiesEntity> findTechnology(String userId, String param) {
		
		ProjectEntity entity=projectRepo.findByUserId(userId);
		
		
		int id=entity.getId();
		
		List<TechnologiesEntity> list =technologiesRepo.findTechnology(param, id);
		return list;
	}
	
	

}

package com.xworkz.project.service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.project.dto.TechnologiesDTO;
import com.xworkz.project.entity.TechnologiesEntity;

public interface TechnologiesService {
	
	boolean save(TechnologiesDTO dto);
	
	default List<TechnologiesDTO> findAll(){
		return null;
	}
	
	 List<TechnologiesEntity> findTechnology(String userId,String param);

}

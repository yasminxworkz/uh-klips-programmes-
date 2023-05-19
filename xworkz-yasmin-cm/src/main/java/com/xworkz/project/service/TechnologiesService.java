package com.xworkz.project.service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.project.dto.TechnologiesDTO;

public interface TechnologiesService {
	
	Set<ConstraintViolation<TechnologiesDTO>> validateAndSave(TechnologiesDTO dto);
	
	default List<TechnologiesDTO> findAll(){
		return null;
	}
	
	default List<TechnologiesDTO> findByTechnology(String techName){
		return null;
	}

}

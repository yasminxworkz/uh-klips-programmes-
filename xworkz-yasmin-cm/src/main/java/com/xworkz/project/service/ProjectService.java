package com.xworkz.project.service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.project.dto.DTOClass;
import com.xworkz.project.entity.EntityClass;

public interface ProjectService {

	Set<ConstraintViolation<DTOClass>> validateAndSave(DTOClass dto);
	
	List<DTOClass> uniqueCheck();

}

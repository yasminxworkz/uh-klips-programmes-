package com.xworkz.project.service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;


import com.xworkz.project.dto.DTOClass;


public interface ProjectService {

	Set<ConstraintViolation<DTOClass>> validateAndSave(DTOClass dto);
	
	List<DTOClass> uniqueCheck();
	
	boolean sendMail(String to);
	
	 default List<DTOClass> findByUserIdAndPassword(String userId,String password){
	    	return null;
	    }

}

package com.xworkz.apps.services;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.apps.dto.AppDTO;

public interface AppService {
	
	Set<ConstraintViolation<AppDTO>> validateAndSave(AppDTO dto);
    default AppDTO findById(int id) {
		
		return null;
		
	}
    
    default List<AppDTO> findByName(String name){
    	return null;
    }
    
    Set<ConstraintViolation<AppDTO>> update(AppDTO dto);
    
    boolean deleteById(int id) ;

}

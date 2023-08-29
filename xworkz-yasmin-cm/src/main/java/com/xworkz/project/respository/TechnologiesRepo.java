package com.xworkz.project.respository;

import java.util.List;

import com.xworkz.project.entity.TechnologiesEntity;



public interface TechnologiesRepo {

	boolean save(TechnologiesEntity entity);
	
	List<TechnologiesEntity> findAll();
	
	 List<TechnologiesEntity> findTechnology(String param,int id);
		
	
}

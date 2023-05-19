package com.xworkz.project.respository;

import java.util.List;

import com.xworkz.project.entity.TechnologiesEntity;



public interface TechnologiesRepo {

	boolean save(TechnologiesEntity entity);
	
	List<TechnologiesEntity> findAll();
	
	default List<TechnologiesEntity> findByTechnology(String techName){
		return null;
	}
}

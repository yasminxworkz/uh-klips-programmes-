package com.xworkz.apps.repository;


import java.util.List;

import com.xworkz.apps.entity.AppEntity;

public interface AppRepo {
	
	boolean save(AppEntity entity);

	default AppEntity findById(int id) {
		return null;
	}
	
	default List<AppEntity> findByName(String name){
		return null;
	}
	
	boolean update(AppEntity entity);
	
	boolean  deleteById(int id); 
		
	

}

package com.xworkz.project.respository;

import java.util.List;



import com.xworkz.project.entity.EntityClass;


public interface ProjectRepo {

	boolean save(EntityClass entity);
	
	List<EntityClass> uniqueCheck();
	
	default List<EntityClass> findByUserIdAndPassword(String userId,String password){
		return null;
	}
}

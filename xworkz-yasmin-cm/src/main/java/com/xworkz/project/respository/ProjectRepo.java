package com.xworkz.project.respository;

import java.util.List;

import org.springframework.stereotype.Repository;


import com.xworkz.project.entity.EntityClass;


public interface ProjectRepo {

	boolean save(EntityClass entity);
	List<EntityClass> uniqueCheck();
}

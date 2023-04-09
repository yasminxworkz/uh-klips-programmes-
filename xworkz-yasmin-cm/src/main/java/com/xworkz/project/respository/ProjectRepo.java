package com.xworkz.project.respository;

import java.util.List;

import com.xworkz.project.entity.ProjectEntity;


public interface ProjectRepo {

	boolean save(ProjectEntity entity);
	
	List<ProjectEntity> uniqueCheck();
	
	ProjectEntity findByUserIdAndPassword(String userId);

       boolean updateEntity(ProjectEntity entity);
}

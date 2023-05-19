package com.xworkz.project.service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;



import com.xworkz.project.dto.ProjectDTO;


public interface ProjectService {

	Set<ConstraintViolation<ProjectDTO>> validateAndSave(ProjectDTO dto);
	
	List<ProjectDTO> uniqueCheck();
	
	boolean sendMail(String to, String subject,String text);
	
	String SignIn(String userId,String password);
	
	boolean forgotPassword(String email);
	
	boolean updateEntity(ProjectDTO dto);
	
	ProjectDTO findByUserId(String userId);
	
	 ProjectDTO findByEmail(String email);
	
	ProjectDTO findBysignUpId(int signUpId);
	
	Set<ConstraintViolation<ProjectDTO>> updateProfile(ProjectDTO dto);
	
   
    

}

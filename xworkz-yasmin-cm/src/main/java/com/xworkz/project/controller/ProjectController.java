package com.xworkz.project.controller;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysql.cj.log.Log;


import com.xworkz.project.dto.ProjectDTO;
import com.xworkz.project.service.ProjectService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@RequestMapping("/")
public class ProjectController {

	@Autowired
	ProjectService service;

	public ProjectController() {
		log.info("running ComponentClass................");
	}

	@PostMapping("/save")
	public String onSave(ProjectDTO dto,Model model) {

		log.info("running postMethod in controller.........");

		List<ProjectDTO> dtos = service.uniqueCheck();

		for (ProjectDTO d : dtos) {

			if (d.getUserId().equalsIgnoreCase(dto.getUserId())) {
				model.addAttribute("uniqueError", "user name already exist");

				model.addAttribute("dto", dto);
				return "save"; 
			}

			if (d.getEmail().equalsIgnoreCase(dto.getEmail())) {
				model.addAttribute("uniqueError", "email already exist");
				model.addAttribute("dto", dto);
				return "save";
			}
			
			if(d.getMobileNumber().equals(dto.getMobileNumber())) {
				model.addAttribute("uniqueError", "MobileNumber already exist");
				model.addAttribute("dto", dto);
				return "save";
			}

			
		}
		
		if (!dto.getConfirmPassword().equals(dto.getPassword())) {
			model.addAttribute("confirm", "confirm  password is not same");
			model.addAttribute("dto", dto);
			return "save";
		}


		Set<ConstraintViolation<ProjectDTO>> violations = service.validateAndSave(dto);
		log.info("dto" + dto);
		model.addAttribute("message", violations);

		if (!violations.isEmpty()) {

			System.err.println("validation failed,display error message");
			violations.forEach((cv) -> {
				System.err.println(cv.getMessage());

			});

			return "save";
		}

		else {

			log.info("validation success,display success message");

			return "success";
		}

	}
	
	@GetMapping("/SignIn")
	public String onSignIn(@RequestParam String userId,
			               @RequestParam String password, Model model) {
		
		String msg=this.service.SignIn(userId, password);
		ProjectDTO dto=this.service.findByUserId(userId);
		
		if(msg=="") {
			
			if(dto.getResetPassword()==true) {
				model.addAttribute("userId",  dto.getUserId());
				return "UpdateNewPassword";
			}
			
			model.addAttribute("successMsg", "*****        Welcome     *****" +userId);
			return "LoginSuccess";
		}
			else {
				model.addAttribute("message", msg);
				return "SignIn";
			}
		
	}
	
	@PostMapping("/forgot")
	public String onForgotPassword(@RequestParam String email,Model model) {
		
		boolean reset=this.service.forgotPassword(email);
		
		if(reset==true) {
			model.addAttribute("resetMsg", "password reset successfull..");
			return "forgotPassword";	
		}
		
		model.addAttribute("resetError", "email doesnot exist..");
		return "forgotPassword";	
	}
	
	
	
	@PostMapping("/updatePassword")
	public String onUpdate(@RequestParam String userId, @RequestParam String password,Model model) {
		log.info("running onUpdate in controller........");
		log.info("new password entered by user in controller ........."+password);
		
		ProjectDTO dto=this.service.findByUserId(userId);
		
		if(dto!=null) {
			dto.setPassword(password);
			boolean updated=this.service.updateEntity(dto);
			log.info("password updated ?? "+updated);
			model.addAttribute("successMsg", "*****        Welcome     *****"+userId);
			return "LoginSuccess";
		}
		
		model.addAttribute("error", "invalid password");
		return "UpdateNewPassword";
		
	}
	
}

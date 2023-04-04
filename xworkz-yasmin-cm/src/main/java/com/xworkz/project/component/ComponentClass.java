package com.xworkz.project.component;

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

import com.xworkz.project.dto.DTOClass;
import com.xworkz.project.service.ProjectService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@RequestMapping("/")
public class ComponentClass {

	@Autowired
	ProjectService service;

	public ComponentClass() {
		log.info("running ComponentClass................");
	}

	@PostMapping("/save")
	public String onSave(DTOClass dto,Model model) {

		log.info("running postMethod in controller.........");

		List<DTOClass> dtos = service.uniqueCheck();

		for (DTOClass d : dtos) {

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


		Set<ConstraintViolation<DTOClass>> violations = service.validateAndSave(dto);
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
	
	@GetMapping("/signUp")
	public String onSignUp(@RequestParam(value = "userId", required = false) String userId,
			               @RequestParam(value = "password", required = false) String password, Model model) {
		
		List<DTOClass> list=this.service.findByUserIdAndPassword(userId, password);
		
		if(list!=null & !list.isEmpty()) {
			model.addAttribute("list", list);
			model.addAttribute("message", "*****        Welcome     *****");
			return "LoginSuccess";
		}
			else {
				model.addAttribute("message", "********************userId or password is incorrect***********");
				return "SignUp";
			}
		
	}
}

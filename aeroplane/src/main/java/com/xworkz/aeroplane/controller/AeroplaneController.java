package com.xworkz.aeroplane.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.aeroplane.dto.AeroplaneDTO;
import com.xworkz.aeroplane.service.AeroplaneService;

@Component
@RequestMapping("/")
public class AeroplaneController {
	
	@Autowired
	AeroplaneService service;
	
	public AeroplaneController() {
		System.out.println("created "+getClass().getSimpleName());
	}
	
	@GetMapping("/search")
	public String onSearch(@RequestParam Integer id,Model model) {
		AeroplaneDTO dto=service.findById(id);
		if(dto!=null) {
			model.addAttribute("dto", dto);
		}
		else {
			model.addAttribute("message", "no data found for id");
		}
		return "search";

		

	}

	
	@PostMapping("/airways")
	public String aeroplane(Model model,AeroplaneDTO dto) {
		System.out.println("running postMethod in controller.........");
		Set<ConstraintViolation<AeroplaneDTO>> violations = service.validateAndSave(dto);
		System.out.println(dto);
		model.addAttribute("violations", violations);
		
if (!violations.isEmpty()) {
			
			System.err.println("validation failed,display error message");
			violations.forEach((cv) -> {
				System.err.println(cv.getMessage());
			});
			return "aeroplane";

		} else {
			System.out.println("validation success,display success message");

			return "success";

		}
		
		
	}
	
	

}

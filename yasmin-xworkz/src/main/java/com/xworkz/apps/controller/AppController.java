package com.xworkz.apps.controller;

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

import com.xworkz.apps.dto.AppDTO;
import com.xworkz.apps.services.AppService;



@Component
@RequestMapping("/")
public class AppController {

	@Autowired
	AppService service;
	
	public AppController() {
		System.out.println("created "+getClass().getSimpleName());
	}
	
	@GetMapping("/search")
	public String onSearch(@RequestParam Integer id,Model model) {
		AppDTO dto=service.findById(id);
		if(dto!=null) {
			model.addAttribute("dto", dto);
			return "search";

		}else {
			model.addAttribute("message","message *****no data found for id");
			return "search";

		}
		
		
		
		
	}
	
	@GetMapping("/NameSearch")
	public String onNameSearch(@RequestParam String name,Model model) {
		System.out.println("running onNameSearch controller "+name);
		List<AppDTO> list=this.service.findByName(name);
		if(list!=null & !list.isEmpty()) {
		model.addAttribute("list", list);
		
		return "NameSearch";
	}
		else {
			model.addAttribute("message", "********************data not found***********");
			return "NameSearch";
		}
	}
	

	
	@PostMapping("/apps")
	public String onApp(Model model,AppDTO dto) {
		System.out.println("running postMethod in controller.........");
		Set<ConstraintViolation<AppDTO>> violations = service.validateAndSave(dto);
		System.out.println(dto);
		model.addAttribute("violations", violations);
		
if (!violations.isEmpty()) {
			
			System.err.println("validation failed,display error message");
			violations.forEach((cv) -> {
				System.err.println(cv.getMessage());
			});
			return "app";

		} else {
			System.out.println("validation success,display success message");

			return "success";

		}
		
		
	}
	
	@PostMapping("/update")
	public String onUpdate(Model model,AppDTO dto) {
		System.out.println("running postMethod in controller.........");
		Set<ConstraintViolation<AppDTO>> violations = service.update(dto);
		System.out.println(dto);
		
		
if (violations.size()>0) {
	
	model.addAttribute("errors", violations);
	} 
       else {
			
			model.addAttribute("message", "update was success");

		}
		
          return "update";
	}
	
	@GetMapping("/update")
	public String onUpdateSearch(@RequestParam int id,Model model) {
		System.out.println("running onupdate controller "+id);
		AppDTO dto=this.service.findById(id);
	
		model.addAttribute("dto", dto);
		
		return "update";
	
	}
	
	
	@GetMapping("/delete")
	public String onDelete(@RequestParam Integer id,Model model) {
		boolean dto=service.deleteById(id);
		
       model.addAttribute("message", "deletion was successfull..........");
		
			return "NameSearch";

		}
		
		
		
		
	}
	
	
	
	
	
	


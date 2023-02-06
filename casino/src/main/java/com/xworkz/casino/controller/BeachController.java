package com.xworkz.casino.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.casino.dto.BeachDTO;
import com.xworkz.casino.dto.CasinoDTO;

@Component
@RequestMapping("/sea")
public class BeachController {
	
	public BeachController() {
		System.out.println("running BeachController.........");
	}
	
	@PostMapping
	public String onHold(BeachDTO dto,Model model) {
		model.addAttribute("name", dto.getName());
		model.addAttribute("location", dto.getLocation());
		model.addAttribute("noOfGames", dto.getNoOfGames());
		model.addAttribute("clean", dto.isClean());
		
		return "beachsuccess.jsp";
	}
}

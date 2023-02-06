package com.xworkz.casino.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.casino.dto.CasinoDTO;

@Component
@RequestMapping("/play")
public class CasinoController {
	
	
	public CasinoController() {
		System.out.println("created CasinoController............");
	}
	
	@PostMapping
	public String onHold(CasinoDTO dto,Model model) {
		model.addAttribute("name", dto.getName());
		model.addAttribute("cruise", dto.getCruise());
		model.addAttribute("EntryFee", dto.getEntryFee());
		model.addAttribute("FreeFood", dto.isFreeFood());
		model.addAttribute("FreeAlcohol", dto.isFreeAlcohol());
		return "casinosuccess.jsp";
	}
}

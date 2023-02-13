package com.xworkz.movies.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.movies.Service.MoviesService;
import com.xworkz.movies.dto.MoviesDTO;

@Component
@RequestMapping("/act")
public class MoviesComponent {
    
	@Autowired
	private MoviesService service;
	
	public MoviesComponent() {
		System.out.println("running MoviesComponent..........");
	}
	
	@PostMapping
	public String onMovie(MoviesDTO dto,Model model) {
		boolean saved=this.service.validateAndSave(dto);
		System.out.println("saved : "+saved);
		model.addAttribute("mdto", dto);
		System.out.println(dto);
		return "index";
	}
}

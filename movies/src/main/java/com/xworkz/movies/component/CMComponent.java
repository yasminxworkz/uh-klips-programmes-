package com.xworkz.movies.component;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.movies.Service.CMService;
import com.xworkz.movies.dto.CMDTO;

@Component
@RequestMapping("/CM")
public class CMComponent {
	
	@Autowired
	private CMService cmservice;
	
	public CMComponent() {
		System.out.println("running CMComponent..........");
	}
	
	@PostMapping
	public String onCM(CMDTO dto,Model model) {
		System.out.println("running onCM "+dto);
		
		Set<ConstraintViolation<CMDTO>> constraintvoilations=this.cmservice.validateAndSave(dto);
		
		if(!constraintvoilations.isEmpty()) {
			System.out.println("validstion failed, display error messages");
			constraintvoilations.forEach((cv)->{System.err.println(cv.getMessage());});
			
			
		}
		else {
			System.out.println("validation success,display success message");
		}
		
		return "CM";
	}

}

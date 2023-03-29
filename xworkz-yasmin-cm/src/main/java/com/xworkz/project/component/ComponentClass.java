package com.xworkz.project.component;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String onSave(Model model, DTOClass dto) {

		log.info("running postMethod in controller.........");

		List<DTOClass> dtos = service.uniqueCheck();

		for (DTOClass d : dtos) {

			if (d.getUserId().equalsIgnoreCase(dto.getUserId())) {
				model.addAttribute("uniqueError", "user name already exist");

				if (d.getEmail().equalsIgnoreCase(dto.getEmail())) {
					model.addAttribute("uniqueError", "userName and  email already exist");

					model.addAttribute("dto", dto);
					return "save";

				}
			}
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
}

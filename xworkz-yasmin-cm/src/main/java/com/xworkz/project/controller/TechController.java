package com.xworkz.project.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.ConstraintViolation;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.project.dto.ProjectDTO;
import com.xworkz.project.dto.TechnologiesDTO;
import com.xworkz.project.service.TechnologiesService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/")
public class TechController {
	
	@Autowired
	TechnologiesService service;
	
	public TechController() {
		log.info("running TechController............");
	}
	
	@PostMapping("/add")
	public String onSave(TechnologiesDTO dto, Model model, HttpServletRequest request,HttpServletResponse response,ProjectDTO projectDTO) {
	
		log.info("running onsave in TechController......................");
		HttpSession session=request.getSession(true);
		session.setAttribute("userId", dto.getUserId());
		
		
		Set<ConstraintViolation<TechnologiesDTO>> violations=service.validateAndSave(dto);
		log.info("dto"+ dto);
		model.addAttribute("message", violations);
		
		if(!violations.isEmpty()) {
			System.err.println("validation failed.....................");
			violations.forEach((cv)->{
				System.out.println(cv.getMessage());
			});
			return "addTechnologies";
			
		}
		
		else {
			log.info("validation success......... ");
			model.addAttribute("successMsg", "Welcome " +dto.getUserId());
			if (projectDTO.getProfilepic() != null) {
				session.setAttribute("dtoPic", projectDTO.getProfilepic());
			}
			session.setAttribute("udto", dto);
			
		return "TechSuccess";
		}
	}
	
	@GetMapping("/findAll")
	public String findAll(Model model) {
		List<TechnologiesDTO> list=this.service.findAll();
		if(list!=null) {
			model.addAttribute("dto", list);
		}
		
		else {
			model.addAttribute("message", "do not found");
		}
		return "viewTechnologies";
	}
	
	@GetMapping("/findByTech")
	public String onTechNameSearch(@RequestParam String techName,Model model) {
		log.info("running onTechNameSearch in techController........."+techName);
		List<TechnologiesDTO> list=this.service.findByTechnology(techName);
		if(list!=null && !list.isEmpty() ) {
			model.addAttribute("list", list);
			return "techNameSearch";
			
		}
		
		else {
			model.addAttribute("message", "***********data not found***********");
			return "techNameSearch";
		}
	}
	
	@GetMapping("/down")
	public void onDownload(HttpServletResponse response, @RequestParam String fileName, ProjectDTO dto)
			throws IOException {
		log.info("onDownload "+fileName);
		Path path = Paths.get("D:\\highway\\" + dto.getProfilepic());
		path.toFile();
		response.setContentType("image/jpeg");
		File file = new File("D:\\Project_image_file\\" + fileName);
		InputStream in = new BufferedInputStream(new FileInputStream(file));
		ServletOutputStream out = response.getOutputStream();
		IOUtils.copy(in, out);
		response.flushBuffer();
	
}

}

package com.xworkz.project.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

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
import com.xworkz.project.entity.TechnologiesEntity;
import com.xworkz.project.service.ProjectService;
import com.xworkz.project.service.TechnologiesService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/")
public class TechController {
	
	@Autowired
	TechnologiesService technologiesService;
	
	@Autowired
	ProjectService projectService;
	
	public TechController() {
		log.info("running TechController............");
	}
	
	@PostMapping("/addTechnologies")
	public String onAddTechnologies(TechnologiesDTO dto,Model model) {
		System.out.println("========================================"+dto.getUserId());
		technologiesService.save(dto);
		model.addAttribute("msg", "technology added successfully");
		return "addTechnologies";
	}
	
	@GetMapping("/viewTechnologies")
	public String onViewTechnologies(String userId,Model model) {
		ProjectDTO dto=projectService.findByUserId(userId);
		List<TechnologiesEntity> list=dto.getTechnologiesEntities();
		model.addAttribute("list", list);
		return "viewTechnologies";
	}
	
	@PostMapping("/searchTechnologies")
	public String onSearchTechnologies(String userId,String param,Model model) {
		
		List<TechnologiesEntity> technologiesEntities= technologiesService.findTechnology(userId, param);
		model.addAttribute("list", technologiesEntities);
		return "viewTechnologies";
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

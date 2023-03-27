package com.xworkz.apps.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.apps.dto.AppDTO;
import com.xworkz.apps.services.AppService;

import lombok.extern.slf4j.Slf4j;



@Component
@Slf4j
@RequestMapping("/")
public class AppController {

	@Autowired
	AppService service ;
	
	public AppController() {
	log.info("created"+getClass().getSimpleName());
		
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
		log.info("running onNameSearch controller "+name);
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
		log.info("running postMethod in controller.........");
		Set<ConstraintViolation<AppDTO>> violations = service.validateAndSave(dto);
		log.info("dto"+dto);
		model.addAttribute("message", violations);
		
if (!violations.isEmpty()) {
			
			System.err.println("validation failed,display error message");
			violations.forEach((cv) -> {
				System.err.println(cv.getMessage());
				
			});
			return "app";

		} else {
			log.info("validation success,display success message");

			return "success";

		}
		
		
	}
	
	@PostMapping("/update")
	public String onUpdate(Model model,AppDTO dto) {
		log.info("running postMethod in controller.........");
		Set<ConstraintViolation<AppDTO>> violations = service.update(dto);
		log.info("dto"+dto);
		
		
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
		log.info("running onupdate controller "+id);
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
	
	@GetMapping("/find")
	public String findAll(Model model) {
		
		List<AppDTO> list=this.service.findAll();
		
		if (list != null) {
			
			model.addAttribute("dto", list);
		} else {
			model.addAttribute("mesage", "Do not found ");
		}
		return "findAll";
	}
	
	@GetMapping("/searchByTwoProp")	
	public String onSearchByTwoProp(@RequestParam(value="developedBy",required=false) String developedBy,
			@RequestParam(value="type",required=false) String type, Model model) { 

		log.info("running onSearchName controller " + developedBy);
		List<AppDTO> list = this.service.findByTwoProp(developedBy, type);
		model.addAttribute("list", list);

		return "SearchByTwoProp";

	}
	
	@PostMapping("/upload")
	public String onUpload(@RequestParam("chitra")MultipartFile multipartFile, Model model) throws IOException {
		log.info("multipartFile "+multipartFile);
		log.info(multipartFile.getOriginalFilename());
		log.info(multipartFile.getContentType());
		log.info("size"+multipartFile.getSize());
		log.info("getBytes"+multipartFile.getBytes());
		
		byte[] bytes=multipartFile.getBytes();
		Path path=Paths.get("D:\\food-files\\"+multipartFile.getOriginalFilename());
		Files.write(path,bytes);
		
		model.addAttribute("message", "successfully uploaded..................");
		return "imageUpload";
	}
		
	
	   @GetMapping("/download")
		public void onDownload(HttpServletResponse response, @RequestParam String fileName) throws IOException {
			
			response.setContentType("image/jpeg");
			File file=new File("D:\\food-files\\"+fileName);
			InputStream in=new BufferedInputStream(new FileInputStream(file));
			ServletOutputStream out=response.getOutputStream();
			IOUtils.copy(in, out);
			response.flushBuffer();
		}
		
		
	}
	
	
	
	
	
	


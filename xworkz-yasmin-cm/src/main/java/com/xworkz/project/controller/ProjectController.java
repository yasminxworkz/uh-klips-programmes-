package com.xworkz.project.controller;

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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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

import com.mysql.cj.log.Log;


import com.xworkz.project.dto.ProjectDTO;
import com.xworkz.project.service.ProjectService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@RequestMapping("/")
public class ProjectController {

	@Autowired
	ProjectService service;

	public ProjectController() {
		log.info("running ComponentClass................");
	}

	@PostMapping("/save")
	public String onSave(ProjectDTO dto,Model model) {

		log.info("running postMethod in controller.........");

		List<ProjectDTO> dtos = service.uniqueCheck();

		for (ProjectDTO d : dtos) {

			if (d.getUserId().equalsIgnoreCase(dto.getUserId())) {
				model.addAttribute("uniqueError", "user name already exist");

				model.addAttribute("dto", dto);
				return "save"; 
			}

			if (d.getEmail().equalsIgnoreCase(dto.getEmail())) {
				model.addAttribute("uniqueError", "email already exist");
				
				model.addAttribute("dto", dto);
				return "save";
			}
			
			if(d.getMobileNumber().equals(dto.getMobileNumber())) {
				model.addAttribute("uniqueError", "MobileNumber already exist");
				
				model.addAttribute("dto", dto);
				return "save";
			}

			
		}
		
		if (!dto.getConfirmPassword().equals(dto.getPassword())) {
			model.addAttribute("confirm", "confirm  password is not same");
			model.addAttribute("dto", dto);
			return "save";
		}


		Set<ConstraintViolation<ProjectDTO>> violations = service.validateAndSave(dto);
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
			
            model.addAttribute("message", " successfully registered............");
			return "SignIn";
		}

	}
	
	@GetMapping("/SignIn")
	public String onSignIn(@RequestParam String userId,
			               @RequestParam String password, Model model, HttpServletRequest request,HttpServletResponse response) {
		
		String msg=this.service.SignIn(userId, password);
		ProjectDTO dto=this.service.findByUserId(userId);
		
	
		
		if(msg=="") {
			
			if(dto.getResetPassword()==true) {
				model.addAttribute("userId",  dto.getUserId());
				return "UpdateNewPassword";
			}
			
			model.addAttribute("successMsg", "Welcome " +userId);
			
			
			HttpSession session=request.getSession(true);
			session.setAttribute("userId", dto.getUserId());
			
			if (dto.getProfilepic() != null) {
				session.setAttribute("dtoPic", dto.getProfilepic());
			}
			session.setAttribute("udto", dto);
			return "LoginSuccess";
		}
			else {
				model.addAttribute("message", msg);
				
	
	return "SignIn";}
		
	}
	
	@PostMapping("/forgot")
	public String onForgotPassword(@RequestParam String email,Model model) {
		
		boolean reset=this.service.forgotPassword(email);
		
		if(reset==true) {
			model.addAttribute("resetMsg", "password reset successfull.. click here and signIn with new password generated");
			
			return "SignIn";	
		}
		
		model.addAttribute("resetError", "email doesnot exist..");
		return "forgotPassword";	
	}
	
	
	
	@PostMapping("/updatePassword")
	public String onUpdate(@RequestParam String userId, @RequestParam String password,Model model) {
		log.info("running onUpdate in controller........");
		log.info("new password entered by user in controller ........."+password);
		
		ProjectDTO dto=this.service.findByUserId(userId);
		
		if(dto!=null) {
			dto.setPassword(password);
			boolean updated=this.service.updateEntity(dto);
			log.info("password updated ?? "+updated);
			model.addAttribute("UpdatesuccessMsg", "*****     enter the code sent to your mail    *****"+userId);
			return "SignIn";
		}
		
		model.addAttribute("error", "invalid password");
		return "UpdateNewPassword";
		
	}
	
	
	@GetMapping("/update")
	public String onUpdateSearch(@RequestParam String userId,Model model) {
		log.info("running onUpdate in controller "+userId);
		ProjectDTO dto=this.service.findByUserId(userId);
		model.addAttribute("dto", dto);
		return "updateProfile";
	}
	
	@PostMapping("/updateProfile")
	public String onUpdateProfile(ProjectDTO dto, Model model, @RequestParam("profilePicture") MultipartFile file,
			String userId) throws IOException {
		log.info("running onupdate " + dto);
		log.info("multipartFile" + file);
		log.info(file.getOriginalFilename());
		log.info(file.getContentType());
		log.info("Size of file" + file.getSize());
		log.info("Size of bite" + file.getBytes());
		ProjectDTO updateDto = this.service.findByEmail(dto.getEmail());
		if(file!=null) {
			model.addAttribute("message", "Update Profile  success...");
			byte[] bytes = file.getBytes();
			Path path = Paths.get("D:\\Project_image_file\\" + userId + System.currentTimeMillis() + ".jpg");
			String imageName = path.getFileName().toString();
			Files.write(path, bytes);
			updateDto.setProfilepic(imageName);
			log.info("Image name--" + imageName);
			log.info("Image name in tostring--" + path.toString());
			log.info("Image file name--" + path.getFileName());
		}
		updateDto.setMobileNumber(dto.getMobileNumber());
		updateDto.setUserId(dto.getUserId());
		Set<ConstraintViolation<ProjectDTO>> constraintViolations = this.service.updateProfile(updateDto);
		//if (constraintViolations.size() > 0 && file.isEmpty()) {
			model.addAttribute("error", constraintViolations);
			model.addAttribute("error", "please select file");
			log.info("file not uploaded");
			return "updateProfile";

	}
	
	
	@GetMapping("/download")
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

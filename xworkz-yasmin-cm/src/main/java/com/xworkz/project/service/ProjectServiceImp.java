package com.xworkz.project.service;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;

import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import com.xworkz.project.dto.ProjectDTO;
import com.xworkz.project.entity.ProjectEntity;
import com.xworkz.project.respository.ProjectRepo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ProjectServiceImp implements ProjectService {

	@Autowired
	ProjectRepo repo;

	@Autowired
	PasswordEncoder encoder;

	public ProjectServiceImp() {
		log.info("created " + getClass().getSimpleName());
	}
	
	@Async
	@Scheduled(fixedDelay = 1000, initialDelay = 1000)
	@Override
	public void expireOTP() {
		repo.expireOTP();
		
	}


	@Override
	public Set<ConstraintViolation<ProjectDTO>> validateAndSave(ProjectDTO dto) {

		Set<ConstraintViolation<ProjectDTO>> violations = Validation.buildDefaultValidatorFactory().getValidator()
				.validate(dto);

		if (violations != null && !violations.isEmpty()) {
			System.err.println("violations present......invalid data");

			return violations;
		}

		log.info("no violations present,data can be saved");
		ProjectEntity entity = new ProjectEntity();
		
		BeanUtils.copyProperties(dto, entity);
		entity.setCreatedBy(dto.getUserId());
		String encodedPassword = encoder.encode(dto.getPassword());
		entity.setPassword(encodedPassword);
		entity.setOtpExpired(false);
		
		boolean saved = repo.save(entity);

		boolean sent = this.sendMail(dto.getEmail(), "registration completed", "thanks for registering");
		log.info("data saved : " + saved);
		log.info("Email sent -:" + sent);
		return Collections.emptySet();
	}
	
	

	@Override
	public List<ProjectDTO> uniqueCheck() {

		List<ProjectEntity> entities = repo.uniqueCheck();

		List<ProjectDTO> dtos = new ArrayList<ProjectDTO>();

		for (ProjectEntity entity : entities) {

			ProjectDTO dto = new ProjectDTO();
			BeanUtils.copyProperties(entity, dto);

			dtos.add(dto);
			

		}

		return dtos;
	}

	@Override
	public boolean sendMail(String to, String subject, String text) {
		String portNumber = "587";
		String hostName = "smtp.office365.com";
		String fromEmail = "yasmin91912@outlook.com";
		String password = "yasmin@12";

		Properties prop = System.getProperties();
		log.info("properties" + prop);
		prop.put("mail.smtp.host", hostName);
		prop.put("mail.smtp.port", portNumber);
		prop.put("mail.smtp.starttls.enable", true);
		prop.put("mail.debug", true);
		prop.put("mail.smtp.auth", true);
		prop.put("mail.transport.protocal", "smtp");

		Session session = Session.getInstance(prop, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		});

		MimeMessage message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(fromEmail));
			message.setSubject(subject);

			message.setText(text);

			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			Transport.send(message);
			log.info("mail sent successfully");
			return true;

		}

		catch (MessagingException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public String SignIn(String userId, String password) {
		log.info("running findByUserId........ ");
		ProjectEntity entity = this.repo.findByUserId(userId);

		if (entity != null) {
			
			
                 
			if (entity.getLoginCount() >= 3) {
				return "account locked reset password";
			}
			
			if(entity.getOtpExpired()==true) {
				return "OTP expired please resend OTP....";
			}
			

			boolean passwordMatch = encoder.matches(password, entity.getPassword());
			log.info("password match ?? "+passwordMatch);

			if (passwordMatch == true) {
				entity.setLoginCount(0);
				repo.updateEntity(entity);
				return "";
			} else {
				Integer count = entity.getLoginCount();
				count++;
				entity.setLoginCount(count);
				repo.updateEntity(entity);
				return "user not found, invalid userName or password";
			}
		} else {
			return "user not found, invalid userName or password";
		}
	}

	@Override
	public boolean forgotPassword(String email) {

		List<ProjectEntity> entity = this.repo.uniqueCheck();

		for (ProjectEntity projectEntity : entity) {

			if (projectEntity.getEmail().equalsIgnoreCase(email)) {
				log.info(""+entity);

				String passwordGenerated = randomPassword();
				log.info("random password generated---------------"+passwordGenerated);

				boolean sentMail = this.sendMail(email, "new random password", passwordGenerated);
				log.info("new password" + sentMail);
				
				String encoded = encoder.encode(passwordGenerated);

				projectEntity.setPassword(encoded);
				projectEntity.setResetPassword(true);
				projectEntity.setUpdatedBy("SYSTEM");
				projectEntity.setUpdatedDate(LocalDateTime.now());
				projectEntity.setLoginCount(0);
				projectEntity.setOtpRequestedTime(LocalTime.now().plusSeconds(60));
				projectEntity.setOtpExpired(false);
				boolean updated = repo.updateEntity(projectEntity);
				log.info("password updated in database ?? " + updated);

				return true;
			}

		}
		log.info("email not found");
		return false;
	}

	public static String randomPassword() {
		PasswordGenerator randomPassword = new PasswordGenerator();
		CharacterRule LCR = new CharacterRule(EnglishCharacterData.LowerCase);
		LCR.setNumberOfCharacters(2);

		CharacterRule UCR = new CharacterRule(EnglishCharacterData.UpperCase);
		UCR.setNumberOfCharacters(2);

		CharacterRule DR = new CharacterRule(EnglishCharacterData.Digit);
		DR.setNumberOfCharacters(2);

		
		String password = randomPassword.generatePassword(12, LCR, DR, UCR);

		return password;
	}

	@Override
	public boolean updateEntity(ProjectDTO dto) {
		log.info("running UpdateEntity in ProjectServiceImp.....");
		log.info("updated password by user in ProjectServiceImpl........." + dto.getPassword());

		String encodedPass = encoder.encode(dto.getPassword());

		ProjectEntity entity = new ProjectEntity();
		BeanUtils.copyProperties(dto, entity);

		entity.setUpdatedBy(dto.getUserId());
		entity.setResetPassword(false);
		entity.setPassword(encodedPass);
		entity.setCreatedBy(dto.getUserId());
		entity.setUpdatedDate(LocalDateTime.now());
		entity.setOtpExpired(false);
		entity.setOtpRequestedTime(null);
		
		

		repo.updateEntity(entity);
		return true;

	}

	@Override
	public ProjectDTO findByUserId(String userId) {
		log.info("running findByUserid in ProjectServiceImp......................");

		ProjectEntity entity = repo.findByUserId(userId);
		ProjectDTO dto = new ProjectDTO();
		if (entity != null) {
			BeanUtils.copyProperties(entity, dto);
			return dto;
			
		}
		return null;
	}
	
	@Override
	public ProjectDTO findByEmail(String email) {
		log.info("findByEmail"+email);
		ProjectEntity entity = this.repo.findByEmail(email);
		if(entity!=null) {
			ProjectDTO dto = new ProjectDTO();
			BeanUtils.copyProperties(entity, dto);
			return dto;
		}
		return null;
	}
	
	
	
	@Override
	public Set<ConstraintViolation<ProjectDTO>> updateProfile(ProjectDTO dto) {
		ProjectEntity entity = new ProjectEntity();
		BeanUtils.copyProperties(dto, entity);
//		entity.setCreatedBy(dto.getUserId());
//		entity.setPassword(encoder.encode(dto.getPassword()));
        entity.setUpdatedBy(dto.getUserId());
        entity.setUpdatedDate(LocalDateTime.now());
		log.info("password" + dto);
		boolean update = this.repo.updateEntity(entity);
		if (update) {
			// sendMail(dto.getEmail());
			boolean sent = sendMail(entity.getEmail(), "Registraion success ", "thanks for registering");
			System.out.println("mail  sent" + sent);
		}
		log.info("Entity data is update :" + update);
		return Collections.emptySet();
	}

	@Override
	public ProjectDTO findBysignUpId(int signUpId) {
      if(signUpId>0) {
			
			ProjectEntity entity=repo.findBysignUpId(signUpId);
			if(entity!=null) {
				log.info("entitity is found for signUpId "+signUpId);
				ProjectDTO dto=new ProjectDTO();
				BeanUtils.copyProperties(entity, dto);
				return dto;
			}
			
		}
		return null;
	}

	
	
	

	


}

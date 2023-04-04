package com.xworkz.project.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.project.dto.DTOClass;
import com.xworkz.project.entity.EntityClass;
import com.xworkz.project.respository.ProjectRepo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ProjectServiceImp implements ProjectService {

	@Autowired
	ProjectRepo repo;

	public ProjectServiceImp() {
		log.info("created " + getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<DTOClass>> validateAndSave(DTOClass dto) {

		Set<ConstraintViolation<DTOClass>> violations = Validation.buildDefaultValidatorFactory().getValidator()
				.validate(dto);

		if (violations != null && !violations.isEmpty()) {
			System.err.println("violations present......invalid data");

			return violations;
		}

		log.info("no violations present,data can be saved");
		EntityClass entity = new EntityClass();
		BeanUtils.copyProperties(dto, entity);
		entity.setCreatedBy(dto.getUserId());
		boolean saved = repo.save(entity);
		
//		boolean sent = this.sendMail(dto.getEmail());;
		log.info("data saved : " + saved);
//		log.info("Email sent -:" + sent);
		return Collections.emptySet();
	}

	@Override
	public List<DTOClass> uniqueCheck() {

		List<EntityClass> entities = repo.uniqueCheck();

		List<DTOClass> dtos = new ArrayList<DTOClass>();

		for (EntityClass entity : entities) {

			DTOClass dto = new DTOClass();
			BeanUtils.copyProperties(entity, dto);

			dtos.add(dto);

		}

		return dtos;
	}

	@Override
	public boolean sendMail(String to) {
//		String portNumber="587";
//		String hostName="smtp.gmail.com";
//		String fromEmail="yasminkazi07@outlook.com";
//		String password="8549823719";
//		
//		Properties prop=System.getProperties();
//		log.info("properties"+prop);
//		prop.put("mail.smtp.host", hostName);
//		prop.put("mail.smtp.port", portNumber);
//		prop.put("mail.smtp.sttartls.enable", true);
//		prop.put("mail.debug", true);
//		prop.put("mail.smtp.auth", true);
//		prop.put("mail.transport.protocal", "smtp");
//		
//		
//		Session session = Session.getInstance(prop, new Authenticator() {
//		    @Override
//		    protected PasswordAuthentication getPasswordAuthentication() {
//		        return new PasswordAuthentication(fromEmail, password);
//		    }
//		});
//		
//		MimeMessage message= new MimeMessage(session);
//		try {
//			message.setFrom(new InternetAddress(fromEmail));
//			message.setSubject("registration completed");
//			message.setText("thanks for registering!!!..");
//			
//			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//			Transport.send(message);
//			log.info("mail sent successfully");
//			
//		}
//		
//		catch(MessagingException e) {
//			e.printStackTrace();
//		}
		return true;
	}

	@Override
	public List<DTOClass> findByUserIdAndPassword(String userId, String password) {
		log.info("running findByUserIdAndPassword........ ");
		List<EntityClass> entity=this.repo.findByUserIdAndPassword(userId, password);
		List<DTOClass> list=new ArrayList<DTOClass>();
		for (EntityClass entityClass : entity) {
			DTOClass dto=new DTOClass();
			BeanUtils.copyProperties(entityClass, dto);
			list.add(dto);
			
		}
		
		log.info("size of dtos "+list.size());
		log.info("size of entities "+entity.size());
		return list;
	}

}

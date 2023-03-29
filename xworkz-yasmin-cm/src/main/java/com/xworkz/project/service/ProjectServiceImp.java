package com.xworkz.project.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

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
		log.info("data saved : " + saved);
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

}

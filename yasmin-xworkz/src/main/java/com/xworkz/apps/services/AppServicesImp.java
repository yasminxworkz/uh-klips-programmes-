package com.xworkz.apps.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.apps.configuration.AppConfiguration;
import com.xworkz.apps.dto.AppDTO;
import com.xworkz.apps.entity.AppEntity;
import com.xworkz.apps.repository.AppRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AppServicesImp implements AppService {

	@Autowired
	AppRepo repo;
	
	public AppServicesImp() {
		log.info("created "+getClass().getSimpleName());
	}
	
	
	@Override
	public Set<ConstraintViolation<AppDTO>> validateAndSave(AppDTO dto) {
		Set<ConstraintViolation<AppDTO>> violations = Validation.buildDefaultValidatorFactory().getValidator()
				.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("violations present......invalid data");
			return violations;
		}		
		
		
		log.info("no violations present,data can be saved");

		AppEntity entity = new AppEntity();
		BeanUtils.copyProperties(dto, entity);
		
//		entity.setDevelopedBy(dto.getDevelopedBy());
//		entity.setType(dto.getType());
//		entity.setNoOfProducts(dto.getNoOfProducts());
//		entity.setNoOfEmployes(dto.getNoOfEmployes());
//		entity.setName(dto.getName());
//        entity.setId(dto.getId());
        
		boolean saved = repo.save(entity);
		log.info("data saved : " + saved);
		return Collections.emptySet();

	}


	

	@Override
	public AppDTO findById(int id) {
		
			if (id > 0) {
				AppEntity entity = repo.findById(id);
				if (entity != null) {
					log.info("entity is found for id : " + id);
					AppDTO dto = new AppDTO();
					BeanUtils.copyProperties(entity, dto);
//					dto.setDevelopedBy(entity.getDevelopedBy());
//					dto.setType(entity.getType());
//					dto.setNoOfProducts(entity.getNoOfProducts());
//					dto.setNoOfEmployes(entity.getNoOfEmployes());
//					dto.setName(entity.getName());
//					dto.setId(entity.getId());
					return dto;

				}
				
				
			}
		return AppService.super.findById(id);
	}


	@Override
	public List<AppDTO> findByName(String name) {
		
		log.info("running findByName in service "+name);
		if(name!=null & !name.isEmpty()) {
			log.info("name is valid .............calling repo.......");
			List<AppEntity> entities=this.repo.findByName(name);
		List<AppDTO> dtos=new ArrayList<AppDTO>();
		for (AppEntity entity : entities) {
			AppDTO dto=new AppDTO();
			BeanUtils.copyProperties(entity, dto);
//			dto.setDevelopedBy(entity.getDevelopedBy());
//			dto.setName(entity.getName());
//			dto.setNoOfEmployes(entity.getNoOfEmployes());
//			dto.setNoOfProducts(entity.getNoOfProducts());
//			dto.setType(entity.getType());
//			dto.setId(entity.getId());
			dtos.add(dto);
		}
		log.info("size of dtos: "+dtos.size());
		log.info("size of entities: "+entities.size());
		return dtos;
		
		}
		
		else {
			System.err.println("this name is not available.........................");
			return Collections.emptyList();
		}
		
	}


	@Override
	public Set<ConstraintViolation<AppDTO>> update(AppDTO dto) {
		Set<ConstraintViolation<AppDTO>> violations = Validation.buildDefaultValidatorFactory().getValidator()
				.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("violations present......invalid data");
			return violations;
		}		
		
		
		log.info("no violations present,data can be saved");

		AppEntity entity = new AppEntity();
		BeanUtils.copyProperties(dto, entity);
//		entity.setDevelopedBy(dto.getDevelopedBy());
//		entity.setType(dto.getType());
//		entity.setNoOfProducts(dto.getNoOfProducts());
//		entity.setNoOfEmployes(dto.getNoOfEmployes());
//		entity.setName(dto.getName());
//		entity.setId(dto.getId());

		boolean updated = repo.update(entity);
		log.info("data updated : " + updated);
		
		return Collections.emptySet();

		
	}


	@Override
	public boolean deleteById(int id) {
		
			boolean deleted = repo.deleteById(id);
		
		return true;
	}


	@Override
	public List<AppDTO> findAll() {
		List<AppEntity> entity=this.repo.findAll();
		List<AppDTO> list=new ArrayList<AppDTO>();
		for(AppEntity ent :entity) {
			AppDTO dto=new AppDTO();
			BeanUtils.copyProperties(ent, dto);
			list.add(dto);
			
		}
		log.info("size of dtos" + list.size());
		log.info("size of entities" + entity.size());
		return list;
	}


	@Override
	public List<AppDTO> findByTwoProp(String developedBy, String type) {
	
		List<AppEntity> entity=this.repo.findByTwoProp(developedBy, type);
		List<AppDTO> list=new ArrayList<AppDTO>();
		for(AppEntity ent :entity) {
			AppDTO dto=new AppDTO();
			BeanUtils.copyProperties(ent, dto);
			list.add(dto);
			
		}
		log.info("size of dtos" + list.size());
		log.info("size of entities" + entity.size());
		return list;
	}

}

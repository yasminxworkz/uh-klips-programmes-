package com.xworkz.apps.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.apps.dto.AppDTO;
import com.xworkz.apps.entity.AppEntity;
import com.xworkz.apps.repository.AppRepo;

@Service
public class AppServicesImp implements AppService {

	@Autowired
	AppRepo repo;
	
	public AppServicesImp() {
		System.out.println("created "+getClass().getSimpleName());
	}
	
	
	@Override
	public Set<ConstraintViolation<AppDTO>> validateAndSave(AppDTO dto) {
		Set<ConstraintViolation<AppDTO>> violations = Validation.buildDefaultValidatorFactory().getValidator()
				.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("violations present......invalid data");
			return violations;
		}		
		
		
		System.out.println("no violations present,data can be saved");

		AppEntity entity = new AppEntity();
		entity.setDevelopedBy(dto.getDevelopedBy());
		entity.setType(dto.getType());
		entity.setNoOfProducts(dto.getNoOfProducts());
		entity.setNoOfEmployes(dto.getNoOfEmployes());
		entity.setName(dto.getName());
        entity.setId(dto.getId());
        
		boolean saved = repo.save(entity);
		System.out.println("data saved : " + saved);
		return Collections.emptySet();

	}


	@Override
	public AppDTO findById(int id) {
		
			if (id > 0) {
				AppEntity entity = repo.findById(id);
				if (entity != null) {
					System.out.println("entity is found for id : " + id);
					AppDTO dto = new AppDTO();
					dto.setDevelopedBy(entity.getDevelopedBy());
					dto.setType(entity.getType());
					dto.setNoOfProducts(entity.getNoOfProducts());
					dto.setNoOfEmployes(entity.getNoOfEmployes());
					dto.setName(entity.getName());
					dto.setId(entity.getId());
					return dto;

				}
				
				
			}
		return AppService.super.findById(id);
	}


	@Override
	public List<AppDTO> findByName(String name) {
		
		System.out.println("running findByName in service "+name);
		if(name!=null & !name.isEmpty()) {
			System.out.println("name is valid .............calling repo.......");
			List<AppEntity> entities=this.repo.findByName(name);
		List<AppDTO> dtos=new ArrayList<AppDTO>();
		for (AppEntity entity : entities) {
			AppDTO dto=new AppDTO();
			dto.setDevelopedBy(entity.getDevelopedBy());
			dto.setName(entity.getName());
			dto.setNoOfEmployes(entity.getNoOfEmployes());
			dto.setNoOfProducts(entity.getNoOfProducts());
			dto.setType(entity.getType());
			dto.setId(entity.getId());
			dtos.add(dto);
		}
		System.out.println("size of dtos: "+dtos.size());
		System.out.println("size of entities: "+entities.size());
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
		
		
		System.out.println("no violations present,data can be saved");

		AppEntity entity = new AppEntity();
		entity.setDevelopedBy(dto.getDevelopedBy());
		entity.setType(dto.getType());
		entity.setNoOfProducts(dto.getNoOfProducts());
		entity.setNoOfEmployes(dto.getNoOfEmployes());
		entity.setName(dto.getName());
		entity.setId(dto.getId());

		boolean updated = repo.update(entity);
		System.out.println("data updated : " + updated);
		
		return Collections.emptySet();

		
	}


	@Override
	public boolean deleteById(int id) {
		
			boolean deleted = repo.deleteById(id);
		
		return true;
	}


	
	
	
	
	
	
	
	

}

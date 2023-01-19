package com.xworkz.validation.repository;

import org.springframework.stereotype.Component;

import com.xworkz.validation.dto.ResortDto;

@Component
public class ResortRepoImp implements ResortRepo{

	@Override
	public boolean save(ResortDto dto) {
		System.out.println("running save method of Resortrepo");
		System.out.println("dto: "+dto);
		return true;
	}

}

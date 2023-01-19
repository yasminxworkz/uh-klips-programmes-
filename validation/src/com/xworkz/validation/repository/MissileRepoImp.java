package com.xworkz.validation.repository;

import org.springframework.stereotype.Component;

import com.xworkz.validation.dto.MissileDto;

@Component
public class MissileRepoImp implements MissileRepo{

	@Override
	public boolean save(MissileDto dto) {
		System.out.println("running save method of missileRepo");
		System.out.println("dto: "+dto);
		return true;
	}

}

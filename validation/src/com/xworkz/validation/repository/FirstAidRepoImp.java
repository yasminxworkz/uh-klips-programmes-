package com.xworkz.validation.repository;

import org.springframework.stereotype.Component;

import com.xworkz.validation.dto.FirstAidDto;
@Component
public class FirstAidRepoImp implements FirstAidRepo {

	@Override
	public boolean save(FirstAidDto dto) {
		System.out.println("running save method of FirstAidRepo");
		System.out.println("dto: "+dto);
		return true;
	}

}

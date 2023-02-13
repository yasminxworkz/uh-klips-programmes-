package com.xworkz.movies.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.movies.Repository.MoviesRepo;
import com.xworkz.movies.dto.MoviesDTO;

@Service
public class MoviesServiceImp implements MoviesService{
   
	@Autowired
	private MoviesRepo repo;

	@Override
	public boolean validateAndSave(MoviesDTO dto) {
		boolean saved=this.repo.save(dto);
		System.out.println(""+saved);
		return false;
	}

	
	
	

	
}

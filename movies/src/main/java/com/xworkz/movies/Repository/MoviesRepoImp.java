package com.xworkz.movies.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.movies.dto.MoviesDTO;

@Repository
public class MoviesRepoImp implements MoviesRepo {
    
	@Autowired
	EntityManagerFactory entityManagerFactory;
	
	
	@Override
	public boolean save(MoviesDTO dto) {
		System.out.println("running save of repo...........");
		EntityManager entityManager=this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(dto);
		transaction.commit();
		entityManager.close();
		return false;
	}

}

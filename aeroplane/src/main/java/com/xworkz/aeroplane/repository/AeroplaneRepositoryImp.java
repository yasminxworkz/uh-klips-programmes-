package com.xworkz.aeroplane.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.aeroplane.entity.AeroplaneEntity;

@Repository
public class AeroplaneRepositoryImp implements AeroplaneRepository {

	@Autowired
	EntityManagerFactory eFactory;
	
	public AeroplaneRepositoryImp() {
		System.out.println("created "+getClass().getSimpleName());
	}
	
	

	@Override
	public boolean save(AeroplaneEntity entity) {
		EntityManager entityManager = eFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(entity);
		entityTransaction.commit();
		entityManager.close();

		return true;
		
	}
	
	@Override
	public AeroplaneEntity findById(int id) {
		System.out.println("find by id in method of repo.......... ");
		EntityManager entityManager = eFactory.createEntityManager();
		AeroplaneEntity aEntity = entityManager.find(AeroplaneEntity.class, id);
		entityManager.close();
		return aEntity;
		
	}

}

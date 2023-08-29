package com.xworkz.project.respository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.project.entity.TechnologiesEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class TechnologiesRepoImp implements TechnologiesRepo {

	@Autowired
	EntityManagerFactory factory;
	
	public TechnologiesRepoImp() {
		log.info("running  TechnologiesRepoImp.....................");
	}
	
	@Override
	public boolean save(TechnologiesEntity entity) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
	}

	@Override
	public List<TechnologiesEntity> findAll() {
		EntityManager manager=factory.createEntityManager();
		try{
		Query query=manager.createNamedQuery("findAll");
		List<TechnologiesEntity> list=query.getResultList();
		return list;
		}
		finally {
			manager.close();
		}
	}

	@Override
	public List<TechnologiesEntity> findTechnology(String param,int id) {
		System.out.println("running findTechnology in TechnologiesRepoImp.......................");
		EntityManager manager=factory.createEntityManager();
		try {
			System.out.println("===============*********=============  "  +id+"  "+param);

			Query query=manager.createNamedQuery("findTechnology");
			query.setParameter("param", param);
			query.setParameter("id", id);
			List<TechnologiesEntity> list=query.getResultList();
			log.info("total list found "+list.size());
			return list;
		}
		finally {
			manager.close();
		}
	}

	
	
	
}

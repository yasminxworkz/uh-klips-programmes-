package com.xworkz.project.respository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.project.entity.EntityClass;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class ProjectRepoImp implements ProjectRepo {
	

	@Autowired
	EntityManagerFactory factory;

	@Override
	public boolean save(EntityClass entity) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;

	}

	@Override
	public List<EntityClass> uniqueCheck() {
		
		EntityManager manager = this.factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("fetchAll");
			List<EntityClass> list = query.getResultList();
			log.info("total list found in repo " + list.size());

			return list;
		} finally {
			manager.close();
		}
	}
	
	@Override
	public List<EntityClass> findByUserIdAndPassword(String userId, String password) {
		EntityManager manager=this.factory.createEntityManager();
	try {	Query query=manager.createNamedQuery("findByuserIdAndPassword");
		query.setParameter("by", userId);
		query.setParameter("p", password);
		List<EntityClass> list=query.getResultList();
		log.info("total list found in repo "+list.size());
		return list;
	}
	finally {
		manager.close();
	}
	}

}

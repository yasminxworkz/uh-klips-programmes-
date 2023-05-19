package com.xworkz.project.respository;

import java.time.LocalTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.xworkz.project.entity.ProjectEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class ProjectRepoImp implements ProjectRepo {

	@Autowired
	EntityManagerFactory factory;

	@Override
	public boolean save(ProjectEntity entity) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;

	}

	@Override
	public List<ProjectEntity> uniqueCheck() {

		EntityManager manager = this.factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("fetchAll");
			List<ProjectEntity> list = query.getResultList();
			log.info("total list found in repo " + list.size());

			return list;
		} finally {
			manager.close();
		}
	}

	@Override
	public ProjectEntity findByUserIdAndPassword(String userId) {
		EntityManager manager = this.factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByuserIdAndPassword");
			query.setParameter("by", userId);
			Object obj = query.getSingleResult();
			ProjectEntity ent = (ProjectEntity) obj;
			return ent;
		} catch (Exception e) {
			log.info("no data found for!!!!! " + userId);
			return null;

		} finally {
			manager.close();
		}

	}
	
	@Override
	public ProjectEntity findByEmail(String email) {
		EntityManager manager=this.factory.createEntityManager();
		try {
			Query query=manager.createNamedQuery("findByEmail");
			query.setParameter("em", email);
			Object obj=query.getSingleResult();
			ProjectEntity ent=(ProjectEntity)obj;
			return ent;
		}
		catch (Exception e) {
			log.info("no data found for-------"+email);
			return null;
		}
		finally {
			manager.close();
		}
	}
	
	

	@Override
	public boolean updateEntity(ProjectEntity entity) {
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.merge(entity);
			transaction.commit();
			return true;
		} finally {
			manager.close();
		}
	}

	@Override
	public ProjectEntity findBysignUpId(int signUpId) {
		log.info(" running findBysignUpId in repository.....");
		EntityManager manager=factory.createEntityManager();
		ProjectEntity entity=manager.find(ProjectEntity.class, signUpId);
		manager.close();
		
		return entity;
	}

	

//	@Override
//	public void expireOTP() {
//	EntityManager manager=factory.createEntityManager();
//	EntityTransaction transaction=manager.getTransaction();
//	transaction.begin();
//	Query query=manager.createNamedQuery("expireOTP");
//	query.setParameter("boolean", true);
//	query.setParameter("currentTime", LocalTime.now());
//	query.executeUpdate();
//	transaction.commit();
//	manager.close();
//		
//	}
}

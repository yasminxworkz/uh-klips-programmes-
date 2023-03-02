package com.xworkz.apps.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.xworkz.apps.entity.AppEntity;

@Repository
public class AppRepositoryImp implements AppRepo{
     @Autowired
	EntityManagerFactory factory;
     
     public AppRepositoryImp() {
		System.out.println("created "+getClass().getSimpleName());
	}
     
	@Override
	public boolean save(AppEntity entity) {
	
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
	}
	
	@Override
	public AppEntity findById(int id) {
		System.out.println("find by id in method of repo.......... ");
		EntityManager entityManager = factory.createEntityManager();
		AppEntity aEntity = entityManager.find(AppEntity.class, id);
		entityManager.close();
		return aEntity;
		
	}

	@Override
	public List<AppEntity> findByName(String name) {
		EntityManager manager =this.factory.createEntityManager();
	try {
		Query query=manager.createNamedQuery("findByName");
	query.setParameter("by", name);
	List<AppEntity> list=query.getResultList();
	System.out.println("total list found in repo "+list.size());
	
		return list;
	}
	finally {
		manager.close();
	}
	
	
	
	}

	@Override
	public boolean update(AppEntity entity) {
		EntityManager manager=this.factory.createEntityManager();
		try {
		
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.merge(entity);
		transaction.commit();
		
		
		return true;
	}
		finally {
			manager.close();
		}
	}

	

	@Override
	public boolean deleteById(int id) {
		System.out.println("running deleteById in repo.............");
		EntityManager manager=this.factory.createEntityManager();
		
		AppEntity aEntity = manager.find(AppEntity.class, id);
		
		try {
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.remove(aEntity);
		transaction.commit();
		
			return true;
		}
		finally {
			manager.close();
		}
		
	}
	
}

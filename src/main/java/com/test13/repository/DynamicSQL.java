package com.test13.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test13.entities.TestBoardEntity;

@Repository
public interface DynamicSQL extends JpaRepository<TestBoardEntity, String>{
//	@Autowired
//  	EntityManager entityManager;
//	
//  	JPAQuery query = new JPAQuery(em);
//  
//  	public Query createNativeQuery(String sqlString);
//  
//  	String sql = "SELECT ID, AGE, NAME, TEAM_ID FROM MEMBER WHERE AGE > ?";
//  
//  	Query nativeQuery = em.createNativeQuery(sql, Member.class).setParameter(1, 20);
//  
//  	List<Member> resultList = nativeQuery.getResultList();
//	
//	Query q = entityManager.createNativeQuery("SELECT * FROM ");
//	List<Object[]> authors = q.getResultList();
}
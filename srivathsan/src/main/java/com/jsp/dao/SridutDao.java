package com.jsp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.entity.student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

@Component
public class SridutDao {
	@Autowired
	private EntityManager em;
	public void saveStudent(student s1) {
		EntityTransaction  et =em.getTransaction();
		et.begin();
		em.persist(s1);
		et.commit();
	}
	public List<student> getallStudent() {
		Query q=em.createQuery("select s from student s");
		List<student> ls=q.getResultList();
		return ls;	
	}
}

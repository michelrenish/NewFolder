package com.jsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dao.SridutDao;
import com.jsp.entity.student;

@Component
public class Sriservice {
	@Autowired
	private SridutDao dao;
	
	public void saveStudent(student s1) {
		dao.saveStudent(s1);
	}
	public List<student> getallStudent(){
		 return dao.getallStudent();	
	}
}

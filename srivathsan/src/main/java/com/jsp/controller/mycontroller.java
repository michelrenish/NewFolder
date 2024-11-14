package com.jsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.entity.student;
import com.jsp.service.Sriservice;

@Controller
public class mycontroller {
	@Autowired
	private Sriservice service;
	
	@RequestMapping("/hi")
	public String hi() {
		return "hi.jsp";
		}
	@RequestMapping("/register")
	public ModelAndView register() {
		ModelAndView mv=new ModelAndView();
		student s1=new student();
		mv.setViewName("register.jsp");
		mv.addObject("student",s1);
		return mv;
	}
	@RequestMapping("/save")
	public ModelAndView saveStudent(student s1) {
		service.saveStudent(s1);
		List<student> ls=service.getallStudent();
		System.out.println(ls);
		return new ModelAndView("hi.jsp");
		
	}
	

}

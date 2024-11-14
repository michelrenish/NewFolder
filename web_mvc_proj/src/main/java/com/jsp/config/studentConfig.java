package com.jsp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@Configuration
@ComponentScan(basePackages = "com.jsp")

public class studentConfig {
	@Bean
	public EntityManager entityManager() {
		return Persistence.createEntityManagerFactory("dev").createEntityManager();
	}
}

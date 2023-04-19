package com.example.MavenDemoSpringInitializr.RepositoyImpl;

import java.sql.Connection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepository {
	
	private Connection connection;
	
	private static Logger logger = LoggerFactory.getLogger(PersonRepository.class);
	
	public PersonRepository(Connection connection) {
		this.connection = connection;
	}
	
	
	
	

}

package com.example.MavenDemoSpringInitializr.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Book {
	
	private static Logger logger = LoggerFactory.getLogger(Book.class);
	
	private int id;
	private String name;
	
	public Book() {
		logger.info("Book Object in Book Class {}",this);
	}

}

package com.example.MavenDemoSpringInitializr.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	
	private static Logger logger = LoggerFactory.getLogger(Book.class);
	
	private int id;
	private String name;

}

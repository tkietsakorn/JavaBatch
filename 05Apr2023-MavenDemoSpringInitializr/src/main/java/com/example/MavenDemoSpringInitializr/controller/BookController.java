package com.example.MavenDemoSpringInitializr.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MavenDemoSpringInitializr.model.Book;

@RestController
public class BookController {
	
	private static Logger logger = LoggerFactory.getLogger(BookController.class);
	
	@Autowired
	Book book;
	
	public BookController() {
		System.out.println("In BookController Annotation");
	}
	
	@GetMapping("/demo")
	public Book getBook() {
//		Book book = new Book();
		logger.info("Book Object in BookController {}",book);
		return book;
		
		//Book@37b57b54 - Singleton Instance Created By Spring
		//Book@6ace63fa - Created on API Call by User
		//Book@350722c8
		
		//Book@472698d  - Singleton Instance Created By Spring
		//Book@472698d
		//Book@472698d
	}

}

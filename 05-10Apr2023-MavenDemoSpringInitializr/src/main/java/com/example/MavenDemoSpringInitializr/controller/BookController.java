package com.example.MavenDemoSpringInitializr.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.MavenDemoSpringInitializr.model.Book;

@RestController
public class BookController {
	
	private static Logger logger = LoggerFactory.getLogger(BookController.class);
	
//	@Autowired
//	Book book;
	
	Book book;
	
	@Autowired
	public BookController(Book book) {
		this.book = book;
		System.out.println("With Book Object");
	}
	
	public BookController(@Value("${config.value}") int  a) {
		System.out.println("a = "+a);
		System.out.println("With Properties Object");
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
	
	//getBook - GET - Param - Title
	//updateBook - Put - Path Variable - bookId
	//saveBook - Post - Request Body
	
	@GetMapping("/requestParam")
	public void getDataFromParam(@RequestParam(required = false,defaultValue = "Java") String title,
			@RequestParam int price) {
		logger.info(title+" and "+price);
	}
	
	@GetMapping("/pathVariable/{bookId}/{ISBNNumber}")
	public void getDatafromPathVariable(@PathVariable("bookId") int bookId, @PathVariable("ISBNNumber") String IsbnNo) {
		logger.info(bookId + " - "+IsbnNo);
	}
	
	@PostMapping("/requestBody")
	public void getDataFromRequestBody(@RequestBody Book book) {
		logger.info(book.toString());
		
	}

}

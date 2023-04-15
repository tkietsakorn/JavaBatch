package com.example.MavenDemoSpringInitializr.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.MavenDemoSpringInitializr.dto.ErrorResponse;
import com.example.MavenDemoSpringInitializr.model.Book;
import com.example.MavenDemoSpringInitializr.service.BookService;

@RestController
@Configuration
public class BookController {
	
	private static Logger logger = LoggerFactory.getLogger(BookController.class);
	
//	@Autowired
//	Book book;
	
	private Book book;
	
	@Autowired
	public BookController(Book book) {
		this.book = book;
		System.out.println("With Book Object");
	}
	
	public BookController(@Value("${config.value}") int  a) {
		System.out.println("a = "+a);
		System.out.println("With Properties Object");
	}
	
	@Autowired
	@Qualifier("bookServiceImpl2")
	BookService bookService;
	
	@GetMapping("/demo")
	public Book getBook() {
//		Book book = new Book();
		logger.info("Book Object in BookController {}",book);
		bookService.printHello();

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
	
	//Crud APIS
	//insertBook - POST - RequestBody
	//updateBook - PUT - RequestBody
	//getBook - GET - Path Variable
	//DeleteBook - DELETE - Path Variable
	//GetAllBooks - GET 
	
	private HashMap<Integer, Book> bookHashMap = new HashMap<Integer, Book>();
	
	@PostMapping("/book")
	public ResponseEntity insertBook(@RequestBody Book book) {
		
		if(bookHashMap.containsKey(book.getId())) {
			logger.error("Book Id Already present!");
			return new ResponseEntity("Book Id Already present!", HttpStatus.BAD_REQUEST);
		}
		bookHashMap.put(book.getId(), book);
		return new ResponseEntity("Book Inserted Successfully", HttpStatus.ACCEPTED);

	}
	
	@PutMapping("/book")
	public Book updatedBook(@RequestBody Book book) {
		bookHashMap.put(book.getId(), book);
		return bookHashMap.get(book.getId());
	}
	
	@GetMapping("/book/{bookId}")
	public Book getBook(@PathVariable("bookId") int bookId) {
		logger.info("BookId Received : "+bookId);
		return bookHashMap.get(bookId);
	}
	
	@DeleteMapping("/book/{bookId}")
	public String deleteBook(@PathVariable("bookId") int bookId) {
		bookHashMap.remove(bookId);
		return "Book Deleted Successfully";
	}
	
	@GetMapping("/book")
	public List<Book> getBooks(){
		return bookHashMap.values().stream().collect(Collectors.toList());
		}
	


}

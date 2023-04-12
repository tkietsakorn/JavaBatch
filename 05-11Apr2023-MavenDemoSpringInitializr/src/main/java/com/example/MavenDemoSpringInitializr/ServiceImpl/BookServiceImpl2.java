package com.example.MavenDemoSpringInitializr.ServiceImpl;

import org.springframework.stereotype.Service;

import com.example.MavenDemoSpringInitializr.service.BookService;

@Service
public class BookServiceImpl2 implements BookService{

	@Override
	public void printHello() {
		System.out.println("Hello From BookServiceImpl2");		
	}
}

package com.example.MavenDemoSpringInitializr.ServiceImpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.MavenDemoSpringInitializr.service.BookService;

@Service
@Primary
public class BookServiceImpl implements BookService {

	@Override
	public void printHello() {
		System.out.println("Hello From BookServiceImpl");		
	}

}

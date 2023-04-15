package com.example.MavenDemoSpringInitializr.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.MavenDemoSpringInitializr.dto.ErrorResponse;

@Configuration
@ControllerAdvice
public class CustomExceptionHandler {
	
	@ExceptionHandler(MissingServletRequestParameterException.class)
	public ResponseEntity handleMethodArgumentNotValidException(MissingServletRequestParameterException ex) {
		
		List errors = new ArrayList<>();
		errors.add(ex.getParameterName()+"parameter of Type "+ex.getParameterType() +" is Not present");
		
		ErrorResponse errorResponse = new ErrorResponse(errors, HttpStatus.NOT_ACCEPTABLE, ex.getMessage(), "ERR_501");
		return new ResponseEntity(errorResponse,HttpStatus.NOT_ACCEPTABLE);
	}
	
	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	public ResponseEntity handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException ex) {
		
		List errors = new ArrayList<>();
		errors.add(ex.getMessage());
		
		ErrorResponse errorResponse = new ErrorResponse(errors, HttpStatus.BAD_REQUEST, ex.getMessage(), "ERR_502");
		return new ResponseEntity(errorResponse,HttpStatus.BAD_REQUEST);
	}
	
	//Default Exception handler
	@ExceptionHandler(Exception.class)
	public ResponseEntity handleException(Exception ex) {
		
		List errors = new ArrayList<>();
		errors.add(ex.getMessage());
		
		ErrorResponse errorResponse = new ErrorResponse(errors, HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage(), "ERR_500");
		return new ResponseEntity(errorResponse,HttpStatus.INTERNAL_SERVER_ERROR);
	}

}

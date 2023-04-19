package com.example.MavenDemoSpringInitializr.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MavenDemoSpringInitializr.dto.CreatePersonRequest;
import com.example.MavenDemoSpringInitializr.model.Person;
import com.example.MavenDemoSpringInitializr.service.PersonServiceInterf;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	private static Logger logger = LoggerFactory.getLogger(PersonController.class);
	
	@Autowired
	PersonServiceInterf personServiceInterf;
	
	@PostMapping()
	public ResponseEntity createPerson(@RequestBody @Valid CreatePersonRequest createPersonRequest) {
		
//		if(createPersonRequest.getFirst_name() == null || createPersonRequest.getFirst_name().isEmpty()) {
//			logger.error("Person's First Name is Empty");
//			return new ResponseEntity(HttpStatus.BAD_REQUEST);
//		}
//		
//		if(createPersonRequest.getLast_name() == null || createPersonRequest.getLast_name().isEmpty()) {
//			logger.error("Person's Last Name is Empty");
//			return new ResponseEntity(HttpStatus.BAD_REQUEST);
//		}
		
		logger.info(createPersonRequest.toString());
		personServiceInterf.createPerson(createPersonRequest);
		return null;
	}
	
	@GetMapping("/{personId}")
	public Person getPerson(@PathVariable("personId") int personId) {
		return personServiceInterf.getPerson(personId);
	}
	
	@DeleteMapping("/{personId}")
	public void deletePerson(@PathVariable("personId") int personId) {
		personServiceInterf.deletePerson(personId);
	}
	
	@GetMapping("/all")
	public List<Person> getAllPersons(){
		return personServiceInterf.getAllPersons();
	}

}

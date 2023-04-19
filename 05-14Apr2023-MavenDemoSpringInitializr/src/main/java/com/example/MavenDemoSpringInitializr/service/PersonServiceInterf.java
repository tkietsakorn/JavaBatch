package com.example.MavenDemoSpringInitializr.service;

import java.util.List;

import com.example.MavenDemoSpringInitializr.dto.CreatePersonRequest;
import com.example.MavenDemoSpringInitializr.model.Person;

public interface PersonServiceInterf {
	
	void createPerson(CreatePersonRequest createPersonRequest);
	
	Person getPerson(int personId);
	
	Person deletePerson(int personId);
	
	List<Person> getAllPersons();


}

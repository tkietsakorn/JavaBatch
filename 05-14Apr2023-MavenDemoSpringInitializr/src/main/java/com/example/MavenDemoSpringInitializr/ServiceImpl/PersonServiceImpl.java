package com.example.MavenDemoSpringInitializr.ServiceImpl;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MavenDemoSpringInitializr.RepositoyImpl.PersonRepository;
import com.example.MavenDemoSpringInitializr.dto.CreatePersonRequest;
import com.example.MavenDemoSpringInitializr.model.Person;
import com.example.MavenDemoSpringInitializr.service.PersonServiceInterf;

@Service
public class PersonServiceImpl implements PersonServiceInterf {
	
	@Autowired
	PersonRepository personRepository;

	@Override
	public void createPerson(CreatePersonRequest createPersonRequest) {

		Person person = createPersonRequest.toPerson();
		
		if(person.getAge() == null) {
			person.setAge(calculateAgeFromDob(person.getDob()));
		}
		personRepository.createPerson(person);
	}
	
	private Integer calculateAgeFromDob(String dob) {
		LocalDate dobDate = LocalDate.parse(dob);
		LocalDate currentDate = LocalDate.now();
		
		return Period.between(dobDate, currentDate).getYears();
	}

	@Override
	public Person getPerson(int personId) {
		return personRepository.getPerson(personId);
	}

	@Override
	public Person deletePerson(int personId) {
		Person person = personRepository.getPerson(personId);
		
		if(person == null) {
			throw new BadPersonRequestException("Person with id="+personId+" is not present in db");
		}
		personRepository.deletePerson(personId);
		return null;
	}

	@Override
	public List<Person> getAllPersons() {
		return personRepository.getAllPersons();
	}

}

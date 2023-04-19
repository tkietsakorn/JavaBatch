package com.example.MavenDemoSpringInitializr.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.example.MavenDemoSpringInitializr.model.Person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreatePersonRequest {
	
	@NotBlank(message = "First Name Should Not be Blank")
	@Size(min = 2)
	private String first_name;
	
	@NotBlank(message = "Last Name Should Not be Blank")
	private String last_name;
		
	@Size(min=5)
	private String dob;
	
	public Person toPerson() {
		return Person.builder().first_name(first_name).last_name(last_name).dob(dob).build();
	}

}

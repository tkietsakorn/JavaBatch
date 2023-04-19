package com.example.MavenDemoSpringInitializr.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {
	
	private Integer id;
	
	private String first_name;
	
	private String last_name;
	
	private Integer age;
	
	private String dob;


}

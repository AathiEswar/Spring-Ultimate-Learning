package com.spring_boot.web_app_todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Validation in Spring Boot
/*
* S1 - Add started validation in pom.xml
* S2 - Two way bind the Controller and Jsp ( Form Backing Object )
* 	 - Add the form spring validation tag
* 	 - add modelAttribute to bind the bean and form , add path to bind properties and input
* S3 - Validation in the Bean ( Entity )
* S4 - Display validations errors in the view
*  */

@SpringBootApplication
public class WebAppTodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebAppTodoApplication.class, args);
	}

}

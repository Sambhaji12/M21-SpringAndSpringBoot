package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@ComponentScan 
@Configuration
@SpringBootApplication
@EnableAutoConfiguration 
public class SpringMvcApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context =SpringApplication.run(SpringMvcApplication.class, args);
		//SpringApplication.run(SpringStarterProjectApplication.class, args);
		//programmer no need to create object 
		
		//Student s1 =new Student();
		//s1.display();
		/*Student s=context.getBean(Student.class);
		s.display();*/
		HelloController h=context.getBean(HelloController.class);
		h.display();
		
	}

}

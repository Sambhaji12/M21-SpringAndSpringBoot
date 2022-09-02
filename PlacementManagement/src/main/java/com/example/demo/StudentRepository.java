package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;


// JpaRepository is exits in spring Data JPA dependencies while creating the project have added 
public interface StudentRepository extends  JpaRepository <Student ,Integer>
{
	
}

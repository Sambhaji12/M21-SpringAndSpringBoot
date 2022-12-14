package com.example.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




@RestController 
public class StudentController 
{
	@Autowired 
	
	private StudentService service;
	
	// RESTFUILL API method to create operation
	@PostMapping(path="/student")
	public void add(@RequestBody Student s)
	{
		service.create(s);
	}
	
	//RESTFUL  API method for delete operation 
	@DeleteMapping("/student/{id}")
	public void remove(@PathVariable  Integer id )
	{
		service.delete(id);
	}
	//RESTFUL  API method for update  operation
	
	
	@PutMapping("/student/{id}")
	public ResponseEntity<?> update(@RequestBody Student s,@PathVariable Integer id )
	{
		try
		
		{
				Student existObject=service.retrieve(id);
				service.create(s);
				return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	//RESTFUL  API method for retrieve  operation
	@GetMapping(path="/student/{id}")
	public  ResponseEntity<Student>get(@PathVariable Integer id)
	{try
	{
		Student s=service.retrieve(id);
			
		return new ResponseEntity<Student>(s,HttpStatus.OK);
	}
	catch(NoSuchElementException e)
	{
		return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
	}
		
	}
	//RESTFUL  API method for retrieve all  operation
	@GetMapping("/student")
	public List<Student> ListAll()
	{
		return service.retrieveAll();
	}
	
	
}

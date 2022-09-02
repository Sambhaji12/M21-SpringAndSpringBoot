package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
@Transactional 
public class StudentService 
{	// to get access the JPA  repository 
	
	@Autowired // to inject object dependencies 
	private StudentRepository repo;
	
	// create or insert 
	public void create (Student s)
	{
		repo.save(s);
	}
	
	// retrieve data with specific id 
	
	public Student retrieve (Integer id)
	{
		return repo.findById(id).get();
		
	}
	// to retrieve all data 
	
	public List <Student > retrieveAll()
	{
		return repo.findAll();
		
	}
	// update the record 
	// delete the record by id 
	
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}
	
	
}

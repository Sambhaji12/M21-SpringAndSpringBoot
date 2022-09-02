package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="placement")
public class Placement 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String qualification;
	private Integer year;
	
	public Placement() 
	{
		
	}
	
	//constructor
	public Placement(Integer id, String name, String college, String qualification, Integer year) {
		super();
		this.id = id;
		this.name = name;
		this.qualification = qualification;
		this.year = year;
	}
	
	//setters and getters method
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	
	//to string method
	@Override
	public String toString() 
	{
		return "Placement [id=" + id + ", name=" + name + ",  qualification=" + qualification
				+ ", year=" + year + "]";
	}

}
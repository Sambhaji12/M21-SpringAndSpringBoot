package com.springcore;

public class Person
{	private int id;
	private String personName;
	private Certi certi;
	
	public Person(int id, String personName ,Certi certi) {
		
		this.id = id;
		this.personName = personName;
		this.certi=certi;
		
		
	}


	@Override
	public String toString() {
		return this.id + this.personName +"{"+this.certi.Certiname+"}";
	}
	
	
	
}

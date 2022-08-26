package com.cg.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Moblie {

	public static void main(String[] args) 
	{
		// we should not  to source code 
		// this application should be configure 
		/*Jio j=new Jio();
		j.calling();
		j.data();
		
		Idea i=new Idea();
		i.calling();
		i.data();*/
		
		ApplicationContext a = new  ClassPathXmlApplicationContext("beans.xml"); 
		System.out.println("Config loaded ....");
		/*Idea i=(Idea)a.getBean("Idea");
		i.calling();
		i.data();
		
		Jio j=(Jio)a.getBean("Jio");
		j.calling();
		j.data();*/
		Sim s=a.getBean("Sim ",Sim.class);
		s.calling();
		s.data();
		
		

	}

}

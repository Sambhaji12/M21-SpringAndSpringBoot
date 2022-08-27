package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext a=new ClassPathXmlApplicationContext("com/springcore/ConfigPerson.xml");
		
		Person per=(Person)a.getBean("person");
		System.out.println(per);

		Addtion a1=(Addtion)a.getBean("add");
		a1.doSum();
		a1.doSum();
	}

}

package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoconfig.xml");
		Emp em=(Emp)a.getBean("employee");
		System.out.println(em);

	}

}

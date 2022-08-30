package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



// bean creation 
@RestController // request and respone from the web
public class HomeController 
{
	@RequestMapping("home")
	public String Home()
	{
		System.out.println("Welcome to java full stack program :0");
		return "home.html" ;
	}
}

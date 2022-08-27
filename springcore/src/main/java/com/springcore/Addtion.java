package com.springcore;

public class Addtion 
{
	private int a;
	private int b;
	
	public Addtion (int a ,int b)
	{
		this.a=a;
		this.b=b;
		
		System.out.println("Constructor int ,int ");
		
		
	}
	
	public Addtion(double a,double b)
	{
		this.a=(int)a;
		this.b=(int)b;
		
		System.out.println("constuctor double ,double");
	}
	
	public void doSum()
	{
		System.out.println("sum is"+(this.a+this.b));
	}
	
	
}

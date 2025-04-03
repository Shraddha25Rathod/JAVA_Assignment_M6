package com.oops;

class First 
{
	
	public void display()
	{
		System.out.println("This is First class..");
	}
}
class Second extends First
{
	public void display()
	{
		System.out.println("This Is Second Class...");
	}
}
public class MethodOverRiding 
{
	public static void main(String[] args)
	{
		First f1=new First();
		f1.display();
		f1=new Second();
		f1.display();
		
	}
}

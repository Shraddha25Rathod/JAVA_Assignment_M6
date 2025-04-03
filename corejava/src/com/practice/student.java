package com.practice;

public class student 
{
	private String name;
	private int age;

	public student(String name, int age)
	{
	  this.name = name;
	  this.age = age;
	}

	public void displayDetails()
	{
	  System.out.println("Name: " + name);
	  System.out.println("Age: " + age);
	}

	public static void main(String[] args) 
	{
	  student student = new student("Shraddha", 21);
	  student.displayDetails();
	}
}

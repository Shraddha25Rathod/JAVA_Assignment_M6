package com.practice;
class person
{
	String name;
	int age;
	
	person(String personName,int personAge)
	{
		name = personName;
		age = personAge;
	}
	void DisplayDetails()
	{
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	}
	
}
public class ParameterizedConstructor 
{
	public static void main(String[] args)
	{
		person person1= new person("Tisha" ,19);
		
		person1.DisplayDetails();
		
	}
}

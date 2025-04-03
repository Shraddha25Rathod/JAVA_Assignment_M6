package com.oops;

class student
{
	int sid;//data member or variables
	String sname,city;
	public void setDataValue()//member  function of methods
	{
		sid=1;
		sname="shraddha";
		city="Ahemdabad";
	}
	public void display()
	{
		System.out.println("sid is..."+sid);
		System.out.println("sname is..."+sname);
		System.out.println("city is..."+city);
	}
}

public class ClassDemo 
{
	public static void main(String[] args)
	{
		student s1=new student();//s1 is an object of student class
		s1.display();
		s1.setDataValue();
		s1.display();
	}
}

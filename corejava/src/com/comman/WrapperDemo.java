package com.comman;

class Student 
{
	public void show()
	{
	}
}
public class WrapperDemo
{
	public static void main(String[] args) 
	{
		Integer i1=new Integer(123);
		System.out.println("AutoBoxing is..."+i1);
		
		int a=100;
		Integer i2=new Integer(a);
		System.out.println("Boxing is..."+i2);
		
		int b=i2.intValue();
		System.out.println("UnBoxing is.."+b);
		
		String s="789";
		int x=Integer.parseInt(s);
		System.out.println("UnBoxing is.."+x);
		
		Object o1=new Object();
		Student s1=new Student();
	}
}

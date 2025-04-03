package com.collection;

import java.util.ArrayList;
import java.util.Iterator;


public class GenericDemo2 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> a1=new ArrayList<Student>();
		
		Student s1=new Student();
		s1.setSid(1);
		s1.setSname("shraddha");
		s1.setcity("Ahemdabad");
		
		Student s2=new Student();
		s2.setSid(2);
		s2.setSname("Tisha");
		s2.setcity("G.nagar");
		
		a1.add(s1);
		a1.add(s2);
		
		System.out.println(a1);
		
		Iterator<Student> i1=a1.iterator();
		while(i1.hasNext())
		{
			Student s=(Student)i1.next();
			System.out.println("Sid is..."+s.getSid());
			System.out.println("Sname is..."+s.getSname());
			System.out.println("Scity is..."+s.getcity());
			System.out.println();
		}
	}
}

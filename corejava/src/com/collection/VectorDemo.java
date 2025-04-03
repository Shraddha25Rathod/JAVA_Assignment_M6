package com.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo 
{
	public static void main(String[] args) 
	{
		Vector v1=new Vector(2,1);
		System.out.println("Default size is..."+v1.size());
		System.out.println("Default capacity is.."+v1.capacity());
		System.out.println("Default value is..."+v1);
		v1.add(100);
		v1.add("shraddha");
		v1.add(45.65f);
		v1.add('T');
		v1.add(new Integer(123));
		v1.add("shraddha");
		System.out.println("Now size is..."+v1.size());
		System.out.println("Now capacity is.."+v1.capacity());
		System.out.println("Now value is..."+v1);
		v1.remove(2);
		System.out.println("Now size is..."+v1.size());
		System.out.println("Now capacity is.."+v1.capacity());
		System.out.println("Now value is..."+v1);
		v1.remove("shraddha");
		System.out.println("Now size is..."+v1.size());
		System.out.println("Now capacity is.."+v1.capacity());
		System.out.println("Now value is..."+v1);
		//Iterator i1=v1.iterator();
		//while(i1.hasNext())
		//{
			//System.out.println(i1.hasNext());
		//}
		Enumeration e1=v1.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
	}
}

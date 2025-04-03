package com.comman;

public class StringBufferDemo
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("This is Tops Technoligies...");
		System.out.println("Original value is.."+s1);
		System.out.println("Length is.."+s1.length());
		
		s1.insert(0, "Hii");
		System.out.println("Original value is.."+s1);
		System.out.println("Length is..."+s1.length());
		
		s1.append("Shraddha Rathod..");
		System.out.println("Original value is.."+s1);
		System.out.println("Length is..."+s1.length());
		
		s1.delete(0,4);
		System.out.println("Original value is.."+s1);
		System.out.println("Length is..."+s1.length());
		
		System.out.println("Original value is.."+s1);
		System.out.println("Length is..."+s1.length());
	}
}

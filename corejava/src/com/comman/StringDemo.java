package com.comman;

public class StringDemo 
{
	public static void main(String[] args) 
	{
		String s1=new String("This is Tops Technologies...");
		System.out.println("Original value is.."+s1);
		System.out.println("Length is.."+s1.length());
		System.out.println("Uppercase is..."+s1.toUpperCase());
		System.out.println("Lowercase is..."+s1.toLowerCase());
		System.out.println("Substring is..."+s1.substring(2));
		System.out.println("substring is..."+s1.substring(2,4));
		System.out.println("Charat is..."+s1.charAt(2));
		System.out.println("Compar String is..."+s1.compareTo("This is Tops Technologies..."));
		System.out.println("Original value is..."+s1);
		System.out.println("Legth is.."+s1.length());
		char[] c= s1.toCharArray();
		
		for(int i=c.length-1;i>=0;i--)
		{
			System.out.print(c[i]);
		}
	}
}

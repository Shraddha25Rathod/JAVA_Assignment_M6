package com.practice;
/*Explicit type casting*/
public class ExplicitDemo
{
	public static void main(String[] args) 
	{
		double doubleValue = 22.45;
	    int intValue = (int) doubleValue;
	    System.out.println("Integer value: " + intValue);

	    int charAsInt = 50;
	    char charValue = (char) charAsInt;
	    System.out.println("Character value: " + charValue);
	}
}

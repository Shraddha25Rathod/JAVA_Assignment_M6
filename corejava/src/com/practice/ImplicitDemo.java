package com.practice;
/*Implicit type casting*/
public class ImplicitDemo
{
	public static void main(String[] args) 
	{
		int intValue = 10;
	    double doubleValue = intValue;
	    System.out.println("Double value: " + doubleValue);

	    char charValue = 'A';
	    int charAsInt = charValue;
	    System.out.println("Character as integer: " + charAsInt);
	}
}

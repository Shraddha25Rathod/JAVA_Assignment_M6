package com.assignment;
import mypackage.MyClass; 
package mypackage; 

public class MyClass 
{
    public String joinStrings(String str1, String str2)
    {
        return str1 + " " + str2;
    }
}
public class UserDefinedDemo
{
	public static void main(String[] args)
	{
		  MyClass obj = new MyClass(); 
	        String result = obj.joinStrings("Hello", "World"); 
	        System.out.println(result); 
	}
}

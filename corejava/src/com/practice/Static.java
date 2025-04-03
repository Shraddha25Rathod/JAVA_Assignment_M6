package com.practice;
class StaticExample
{
    static int count = 0;

    public static void incrementCount()
    {
        count++;
    }

    public static int getCount() 
    {
        return count;
    }
}
public class Static
{
	public static void main(String[] args) 
	{
		 System.out.println("Initial count: " + StaticExample.getCount());

	        StaticExample.incrementCount();
	        StaticExample.incrementCount();

	        System.out.println("Updated count: " + StaticExample.getCount());
	    
	}
}

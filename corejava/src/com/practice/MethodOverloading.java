package com.practice;
class Overloading
{
	public int add(int a, int b) 
	{
        return a + b;
    }
	
    public double add(double a, double b) 
    {
        return a + b;
    }

   
    public int add(int a, int b, int c) 
    {
        return a + b + c;
    }
}
public class MethodOverloading 
{
	public static void main(String[] args)
	{
		 Overloading e = new Overloading();

	        System.out.println("Sum of two integers: " + e.add(10, 20));

	        System.out.println("Sum of two doubles: " + e.add(5.5, 2.3));

	        System.out.println("Sum of three integers: " + e.add(1, 2, 3));
	    
	}
}

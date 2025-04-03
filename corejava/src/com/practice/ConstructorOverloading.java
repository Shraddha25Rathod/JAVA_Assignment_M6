package com.practice;
class Calculator1 
{
    int num1, num2;
    double num3;

    Calculator1(int a, int b) 
    {
        num1 = a;
        num2 = b;
    }

    Calculator1(double c) 
    {
        num3 = c;
    }

    Calculator1(int a, double c)
    {
        num1 = a;
        num3 = c;
    }

    void display() 
    {
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Number 3: " + num3);
    }
}
public class ConstructorOverloading 
{
	public static void main(String[] args) 
	{
		  Calculator1 calc1 = new Calculator1(10, 20);
	        System.out.println("Using constructor with two integers:");
	        calc1.display();

	        Calculator1 calc2 = new Calculator1(15.5);
	        System.out.println("Using constructor with one double:");
	        calc2.display();

	        
	        
	        Calculator1 calc3 = new Calculator1(5, 12.5);
	        System.out.println("Using constructor with one integer and one double:");
	        calc3.display();
	}
}

package com.practice;
class Parent1 
{
    Parent1() 
    {
        System.out.println("Parent class constructor called.");
    }

    void displayMessage() 
    {
        System.out.println("Message from the Parent class.");
    }
}

class Child1 extends Parent 
{
    Child1() 
    {
        super();
        System.out.println("Child class constructor called.");
    }

    void displayMessage() 
    {
        super.displayMessage();
        System.out.println("Message from the Child class.");
    }
}
public class superDemo 
{
	public static void main(String[] args) 
	{
		 Child1 obj = new Child1();
	        obj.displayMessage(); 
	}
}
